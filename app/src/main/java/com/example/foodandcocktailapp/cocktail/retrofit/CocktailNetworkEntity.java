package com.example.foodandcocktailapp.cocktail.retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

// This cocktail object will be exclusive only to Retrofit
// While the Cocktail object class will be for the project
public class CocktailNetworkEntity {

    @SerializedName("idDrink")
    private String idDrink;

    @SerializedName("strDrink")
    private String name;

    @SerializedName("strCategory")
    private String category;

    @SerializedName("strGlass")
    private String glass;

    @SerializedName("strInstructions")
    private String instructions;

    @SerializedName("strDrinkThumb")
    private String drinkImage;

//    @SerializedName("strIngredient1")
//    private String ing1;
//
//    @SerializedName("strIngredient2")
//    private String ing2;
//
//    @SerializedName("strIngredient3")
//    private String ing3;
//
//    @SerializedName("strIngredient4")
//    private String ing4;
//
//    @SerializedName("strIngredient5")
//    private String ing5;
//
//    @SerializedName("strIngredient6")
//    private String ing6;
//
//    @SerializedName("strIngredient7")
//    private String ing7;
//
//    @SerializedName("strIngredient8")
//    private String ing8;
//
//    @SerializedName("strIngredient9")
//    private String ing9;
//
//    @SerializedName("strIngredient10")
//    private String ing10;
//
//    @SerializedName("strIngredient11")
//    private String ing11;
//
//    @SerializedName("strIngredient12")
//    private String ing12;
//
//    @SerializedName("strIngredient13")
//    private String ing13;
//
//    @SerializedName("strIngredient14")
//    private String ing14;
//
//    @SerializedName("strIngredient15")
//    private String ing15;
//
//    @SerializedName("strMeasure1")
//    private String msr1;
//
//    @SerializedName("strMeasure2")
//    private String msr2;
//
//    @SerializedName("strMeasure3")
//    private String msr3;
//
//    @SerializedName("strMeasure4")
//    private String msr4;
//
//    @SerializedName("strMeasure5")
//    private String msr5;
//
//    @SerializedName("strMeasure6")
//    private String msr6;
//
//    @SerializedName("strMeasure7")
//    private String msr7;
//
//    @SerializedName("strMeasure8")
//    private String msr8;
//
//    @SerializedName("strMeasure9")
//    private String msr9;
//
//    @SerializedName("strMeasure10")
//    private String msr10;
//
//    @SerializedName("strMeasure11")
//    private String msr11;
//
//    @SerializedName("strMeasure12")
//    private String msr12;
//
//    @SerializedName("strMeasure13")
//    private String msr13;
//
//    @SerializedName("strMeasure14")
//    private String msr14;
//
//    @SerializedName("strMeasure15")
//    private String msr15;
//
//    private ArrayList<String> ingList;

    CocktailNetworkEntity(String idDrink, String name, String category, String glass,
                          String instructions, String drinkImage){
        this.idDrink = idDrink;
        this.name = name;
        this.category = category;
        this.glass = glass;
        this.instructions = instructions;
        this.drinkImage = drinkImage;
//        if (ingList == null) {
//            this.ingList = new ArrayList<>();
//
//            if (ing1 != null) {
//                this.ingList.add(ing1 + " " + msr1);
//            }
//            if (ing2 != null) {
//                this.ingList.add(ing2 + " " + msr2);
//            }
//            if (ing3 != null) {
//                this.ingList.add(ing3 + " " + msr3);
//            }
//            if (ing4 != null) {
//                this.ingList.add(ing4 + " " + msr4);
//            }
//            if (ing5 != null) {
//                this.ingList.add(ing5 + " " + msr5);
//            }
//            if (ing6 != null) {
//                this.ingList.add(ing6 + " " + msr6);
//            }
//            if (ing7 != null) {
//                this.ingList.add(ing7 + " " + msr7);
//            }
//            if (ing8 != null) {
//                this.ingList.add(ing8 + " " + msr8);
//            }
//            if (ing9 != null) {
//                this.ingList.add(ing9 + " " + msr9);
//            }
//            if (ing10 != null) {
//                this.ingList.add(ing10 + " " + msr10);
//            }
//            if (ing11 != null) {
//                this.ingList.add(ing11 + " " + msr11);
//            }
//            if (ing12 != null) {
//                this.ingList.add(ing12 + " " + msr12);
//            }
//            if (ing13 != null) {
//                this.ingList.add(ing13 + " " + msr13);
//            }
//            if (ing14 != null) {
//                this.ingList.add(ing14 + " " + msr14);
//            }
//            if (ing15 != null) {
//                this.ingList.add(ing15 + " " + msr15);
//            }
//        }
    }

    public String getIdDrink() {
        return idDrink;
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

    public void setIdDrink(String idDrink) {
        this.idDrink = idDrink;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public void setDrinkImage(String drinkImage) {
        this.drinkImage = drinkImage;
    }

//    public String getIng1() {
//        return ing1;
//    }
//
//    public void setIng1(String ing1) {
//        this.ing1 = ing1;
//    }
//
//    public String getIng2() {
//        return ing2;
//    }
//
//    public void setIng2(String ing2) {
//        this.ing2 = ing2;
//    }
//
//    public String getIng3() {
//        return ing3;
//    }
//
//    public void setIng3(String ing3) {
//        this.ing3 = ing3;
//    }
//
//    public String getIng4() {
//        return ing4;
//    }
//
//    public void setIng4(String ing4) {
//        this.ing4 = ing4;
//    }
//
//    public String getIng5() {
//        return ing5;
//    }
//
//    public void setIng5(String ing5) {
//        this.ing5 = ing5;
//    }
//
//    public String getIng6() {
//        return ing6;
//    }
//
//    public void setIng6(String ing6) {
//        this.ing6 = ing6;
//    }
//
//    public String getIng7() {
//        return ing7;
//    }
//
//    public void setIng7(String ing7) {
//        this.ing7 = ing7;
//    }
//
//    public String getIng8() {
//        return ing8;
//    }
//
//    public void setIng8(String ing8) {
//        this.ing8 = ing8;
//    }
//
//    public String getIng9() {
//        return ing9;
//    }
//
//    public void setIng9(String ing9) {
//        this.ing9 = ing9;
//    }
//
//    public String getIng10() {
//        return ing10;
//    }
//
//    public void setIng10(String ing10) {
//        this.ing10 = ing10;
//    }
//
//    public String getIng11() {
//        return ing11;
//    }
//
//    public void setIng11(String ing11) {
//        this.ing11 = ing11;
//    }
//
//    public String getIng12() {
//        return ing12;
//    }
//
//    public void setIng12(String ing12) {
//        this.ing12 = ing12;
//    }
//
//    public String getIng13() {
//        return ing13;
//    }
//
//    public void setIng13(String ing13) {
//        this.ing13 = ing13;
//    }
//
//    public String getIng14() {
//        return ing14;
//    }
//
//    public void setIng14(String ing14) {
//        this.ing14 = ing14;
//    }
//
//    public String getIng15() {
//        return ing15;
//    }
//
//    public void setIng15(String ing15) {
//        this.ing15 = ing15;
//    }
//
//    public String getMsr1() {
//        return msr1;
//    }
//
//    public void setMsr1(String msr1) {
//        this.msr1 = msr1;
//    }
//
//    public String getMsr2() {
//        return msr2;
//    }
//
//    public void setMsr2(String msr2) {
//        this.msr2 = msr2;
//    }
//
//    public String getMsr3() {
//        return msr3;
//    }
//
//    public void setMsr3(String msr3) {
//        this.msr3 = msr3;
//    }
//
//    public String getMsr4() {
//        return msr4;
//    }
//
//    public void setMsr4(String msr4) {
//        this.msr4 = msr4;
//    }
//
//    public String getMsr5() {
//        return msr5;
//    }
//
//    public void setMsr5(String msr5) {
//        this.msr5 = msr5;
//    }
//
//    public String getMsr6() {
//        return msr6;
//    }
//
//    public void setMsr6(String msr6) {
//        this.msr6 = msr6;
//    }
//
//    public String getMsr7() {
//        return msr7;
//    }
//
//    public void setMsr7(String msr7) {
//        this.msr7 = msr7;
//    }
//
//    public String getMsr8() {
//        return msr8;
//    }
//
//    public void setMsr8(String msr8) {
//        this.msr8 = msr8;
//    }
//
//    public String getMsr9() {
//        return msr9;
//    }
//
//    public void setMsr9(String msr9) {
//        this.msr9 = msr9;
//    }
//
//    public String getMsr10() {
//        return msr10;
//    }
//
//    public void setMsr10(String msr10) {
//        this.msr10 = msr10;
//    }
//
//    public String getMsr11() {
//        return msr11;
//    }
//
//    public void setMsr11(String msr11) {
//        this.msr11 = msr11;
//    }
//
//    public String getMsr12() {
//        return msr12;
//    }
//
//    public void setMsr12(String msr12) {
//        this.msr12 = msr12;
//    }
//
//    public String getMsr13() {
//        return msr13;
//    }
//
//    public void setMsr13(String msr13) {
//        this.msr13 = msr13;
//    }
//
//    public String getMsr14() {
//        return msr14;
//    }
//
//    public void setMsr14(String msr14) {
//        this.msr14 = msr14;
//    }
//
//    public String getMsr15() {
//        return msr15;
//    }
//
//    public void setMsr15(String msr15) {
//        this.msr15 = msr15;
//    }
//
//    public ArrayList<String> getIngList() {
//        return ingList;
//    }
}
