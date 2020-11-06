package com.example.foodandcocktailapp.cocktail.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {CocktailCacheEntity.class}, version = 1)
public abstract class CocktailDatabase extends RoomDatabase {

    public final String cdbName = "cocktail_db";

    public String getCdbName() {
        return cdbName;
    }

    private static CocktailDatabase instance;

    // Room takes care of all the code here
    public abstract CocktailDao cocktailDao();

    // synchronized means only one thread can access this at one time
    public static synchronized CocktailDatabase getInstance(Context context){

        // this way only one database is created,
        if (instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    CocktailDatabase.class, "cocktail_db")
                    .fallbackToDestructiveMigration() // if version # incremented, clear all earlier versions
                    .build();
        }

        return instance;
    }
}
