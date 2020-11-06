package com.example.foodandcocktailapp.cocktail.room;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;


// Data access object, the functions that the database can use
@Dao
public interface CocktailDao {

    // Return what row info was inserted
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public Long insert(CocktailCacheEntity cocktailCacheEntity);

    // Get all from database in live data
    @Query("SELECT * FROM cocktails")
    LiveData<List<CocktailCacheEntity>> get();

    // Delete all entities
    @Query("DELETE FROM cocktails")
    void deleteAllDrinks();
}
