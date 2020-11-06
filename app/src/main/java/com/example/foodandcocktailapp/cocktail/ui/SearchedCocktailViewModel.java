package com.example.foodandcocktailapp.cocktail.ui;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.foodandcocktailapp.cocktail.repository.CocktailRepository;
import com.example.foodandcocktailapp.cocktail.room.CocktailCacheEntity;
import com.example.foodandcocktailapp.cocktail.util.Cocktail;

import java.util.List;

public class SearchedCocktailViewModel extends AndroidViewModel {

    private final CocktailRepository repository;
    private LiveData<List<CocktailCacheEntity>> allCocktails;

    public SearchedCocktailViewModel(@NonNull Application application) {
        super(application);

        this.repository = new CocktailRepository(application);
        allCocktails = repository.getAllCocktails();
    }

    public LiveData<List<CocktailCacheEntity>> getAllCocktails() {
        return allCocktails;
    }
}
