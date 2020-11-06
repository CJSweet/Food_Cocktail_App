package com.example.foodandcocktailapp.cocktail.retrofit;

import android.content.Context;

import androidx.room.Room;

import com.example.foodandcocktailapp.cocktail.room.CocktailDatabase;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public final class RetrofitBuilder {

    private static Retrofit instance;

    // synchronized means only one thread can access this at one time
    public static synchronized Retrofit getInstance(Context context){

        // this way only one database is created,
        if (instance == null){
            instance = new Retrofit.Builder()
                    .baseUrl("https://www.thecocktaildb.com/api/json/v1/1/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return instance;
    }

    //
}
