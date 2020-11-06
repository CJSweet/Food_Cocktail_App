package com.example.foodandcocktailapp.cocktail.ui;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.foodandcocktailapp.cocktail.util.Cocktail;

import java.lang.reflect.InvocationTargetException;

public class CDetailViewModelFactory implements ViewModelProvider.Factory {
    private Cocktail cocktail;

    public CDetailViewModelFactory(Cocktail cocktail){
        this.cocktail = cocktail;
    };

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new CocktailDetailViewModel(cocktail);
    }
}
