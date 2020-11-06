package com.example.foodandcocktailapp.cocktail.util;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Cocktail implements Parcelable {
    private String id;
    private String name;
    private String category;
    private String glass;
    private String instructions;
    private String drinkImage;

    public Cocktail(String id, String name, String category, String glass,
                    String instructions, String drinkImage){
        this.id = id;
        this.name = name;
        this.category = category;
        this.glass = glass;
        this.instructions = instructions;
        this.drinkImage = drinkImage;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getGlass() {
        return glass;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getDrinkImage() {
        return drinkImage;
    }

//    public ArrayList<String> getIngList() {
//        return ingList;
//    }

    // Most cases only need return 0
    @Override
    public int describeContents() {
        return 0;
    }

    // This is where we create the parcel and specify what we want in it
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(drinkImage);
        dest.writeString(category);
        dest.writeString(instructions);
        dest.writeString(glass);
    }
}
