package com.example.foodandcocktailapp.cocktail.repository;

import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.foodandcocktailapp.cocktail.retrofit.RetrofitBuilder;
import com.example.foodandcocktailapp.cocktail.room.CocktailDatabase;
import com.example.foodandcocktailapp.cocktail.util.Cocktail;
import com.example.foodandcocktailapp.cocktail.retrofit.CocktailNetworkEntity;
import com.example.foodandcocktailapp.cocktail.retrofit.NetworkMapper;
import com.example.foodandcocktailapp.cocktail.retrofit.RetrofitInterface;
import com.example.foodandcocktailapp.cocktail.room.CacheMapper;
import com.example.foodandcocktailapp.cocktail.room.CocktailCacheEntity;
import com.example.foodandcocktailapp.cocktail.room.CocktailDao;
import java.util.List;
import retrofit2.Retrofit;

public class CocktailRepository {

    private CocktailDao cocktailDao;
    private RetrofitInterface retrofitInterface;
    private LiveData<List<CocktailCacheEntity>> allCocktails;
    private CacheMapper cacheMapper = new CacheMapper();
    private NetworkMapper networkMapper = new NetworkMapper();

    public LiveData<List<CocktailCacheEntity>> getAllCocktails() {
        return allCocktails;
    }

    public CocktailRepository(Application application){

        // create database
        CocktailDatabase cocktailDatabase = CocktailDatabase.getInstance(application);
        // get Dao
        cocktailDao = cocktailDatabase.cocktailDao();

        // create Retrofit Builder
        Retrofit retrofitBuilder = RetrofitBuilder.getInstance(application);
        retrofitInterface = retrofitBuilder.create(RetrofitInterface.class);

        allCocktails = cocktailDao.get();
    }

    public void searchCocktails(String cocktailName){

        Thread insertThread = new Thread(){
            public void run(){
                try{
                    // get network cocktails
                    List<CocktailNetworkEntity> networkCocktails = retrofitInterface.getCocktails(cocktailName).execute().body().getDrinks();
                    // Convert to Cocktail objects
                    List<Cocktail> cocktailsList = networkMapper.mapFromEntityList(networkCocktails);
                    // Put each Cocktail from list into Room
                    for (Cocktail cocktail : cocktailsList){
                        cocktailDao.insert(cacheMapper.mapToEntity(cocktail));
                    }
                } catch (Exception e){
                    Log.d("CocktailRepository", "getBlog: Error: " + e);
                }
            }
        };

        insertThread.start();
    }

    public void deleteCocktails(){
        Thread deleteThread = new Thread(){
            public void run(){
                try{
                    cocktailDao.deleteAllDrinks();
                } catch (Exception e){
                    Log.d("CocktailRepository", "run: Error:" + e);
                }
            }
        };

        deleteThread.start();
    }
}
