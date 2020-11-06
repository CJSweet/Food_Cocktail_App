package com.example.foodandcocktailapp.cocktail.ui;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import com.example.foodandcocktailapp.cocktail.repository.CocktailRepository;

// AndroidViewModel allows for application to be passed in
public class CocktailStartingViewModel extends AndroidViewModel {

    private static final String TAG = "CocktailStartingViewMod";
    private final CocktailRepository repository;

    public CocktailStartingViewModel(@NonNull Application application) {
        super(application);

        this.repository = new CocktailRepository(application);
    }

    public void searchCocktails(String cocktailName){
        repository.searchCocktails(cocktailName);
    }


    public void deleteCocktails(){
        repository.deleteCocktails();
    }

}
