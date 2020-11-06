package com.example.foodandcocktailapp.cocktail.ui;

import androidx.lifecycle.ViewModel;

import com.example.foodandcocktailapp.cocktail.util.Cocktail;

public class CocktailDetailViewModel extends ViewModel {
    private String drinkName;
    private String imageLink;
    private String glass;
    private String category;
    private String instructions;

    public CocktailDetailViewModel(Cocktail cocktail){
        drinkName = cocktail.getName();
        imageLink = cocktail.getDrinkImage();
        glass = cocktail.getGlass();
        category = cocktail.getCategory();
        instructions = cocktail.getInstructions();
    }

    public String getImageLink() {
        return imageLink;
    }

    public String getDrinkName() {
        return drinkName;
    }


    public String getGlass() {
        return glass;
    }

    public String getCategory() {
        return category;
    }

    public String getInstructions() {
        return instructions;
    }
}
