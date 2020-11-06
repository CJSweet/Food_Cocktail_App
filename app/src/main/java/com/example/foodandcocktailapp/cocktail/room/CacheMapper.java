package com.example.foodandcocktailapp.cocktail.room;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.foodandcocktailapp.cocktail.util.Cocktail;
import com.example.foodandcocktailapp.cocktail.util.CocktailMapper;
import java.util.List;
import java.util.stream.Collectors;
import javax.inject.Inject;

// Map between Cached Cocktail and Cocktail object
public class CacheMapper implements CocktailMapper<CocktailCacheEntity, Cocktail> {

    @Inject
    public CacheMapper(){}

    @Override
    public Cocktail mapFromEntity(CocktailCacheEntity cocktailCacheEntity) {
        return new Cocktail(
                cocktailCacheEntity.getDrinkID(),
                cocktailCacheEntity.getDrinkName(),
                cocktailCacheEntity.getDrinkCategory(),
                cocktailCacheEntity.getDrinkGlass(),
                cocktailCacheEntity.getDrinkInstructions(),
                cocktailCacheEntity.getDrinkImage());
    }

    @Override
    public CocktailCacheEntity mapToEntity(Cocktail cocktail) {
        return new CocktailCacheEntity(
                cocktail.getId(),
                cocktail.getName(),
                cocktail.getCategory(),
                cocktail.getGlass(),
                cocktail.getInstructions(),
                cocktail.getDrinkImage()
        );
    }

    public MutableLiveData<List<Cocktail>> mapFromEntityList(LiveData<List<CocktailCacheEntity>> entities){

        MutableLiveData<List<Cocktail>> cocktails = new MutableLiveData<>();

        cocktails.setValue(entities.getValue().stream().map(this::mapFromEntity).collect(Collectors.toList()));

        return cocktails;
    }
}
