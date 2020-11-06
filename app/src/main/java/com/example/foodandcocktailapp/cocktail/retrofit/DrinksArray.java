package com.example.foodandcocktailapp.cocktail.retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DrinksArray {

    @SerializedName("drinks")
    private List<CocktailNetworkEntity> drinks;

    public List<CocktailNetworkEntity> getDrinks() {
        return drinks;
    }
}
