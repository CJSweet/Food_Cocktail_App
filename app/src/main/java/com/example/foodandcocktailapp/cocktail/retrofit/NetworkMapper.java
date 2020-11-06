package com.example.foodandcocktailapp.cocktail.retrofit;

import com.example.foodandcocktailapp.cocktail.util.Cocktail;
import com.example.foodandcocktailapp.cocktail.util.CocktailMapper;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

// This is for mapping network objects to domain objects
public class NetworkMapper implements CocktailMapper<CocktailNetworkEntity, Cocktail> {

    public NetworkMapper() {
    }

    @Override
    public Cocktail mapFromEntity(CocktailNetworkEntity cocktailNetworkEntity) {

        return new Cocktail(
                cocktailNetworkEntity.getIdDrink(),
                cocktailNetworkEntity.getName(),
                cocktailNetworkEntity.getCategory(),
                cocktailNetworkEntity.getGlass(),
                cocktailNetworkEntity.getInstructions(),
                cocktailNetworkEntity.getDrinkImage());
    }

    @Override
    public CocktailNetworkEntity mapToEntity(Cocktail cocktail) {
        return new CocktailNetworkEntity(cocktail.getId(),
                cocktail.getName(),
                cocktail.getCategory(),
                cocktail.getGlass(),
                cocktail.getInstructions(),
                cocktail.getDrinkImage());
    }

    // Convert all the received cocktail entities to cocktail objects
    public List<Cocktail> mapFromEntityList(List<CocktailNetworkEntity> entities){
        return entities.stream().map(this::mapFromEntity).collect(Collectors.toList());
    }

}
