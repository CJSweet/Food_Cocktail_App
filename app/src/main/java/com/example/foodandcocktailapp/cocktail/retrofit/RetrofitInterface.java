package com.example.foodandcocktailapp.cocktail.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

// interface for calling the GET request
// TODO: Should be a suspend function (send to other Thread)
public interface RetrofitInterface {

    // full section would be search.php?s={drinkName}, but Retrofit can take care of that for us
    @GET("search.php")
    public Call<DrinksArray> getCocktails(@Query("s") String drink);

}
