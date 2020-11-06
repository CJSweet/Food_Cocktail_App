package com.example.foodandcocktailapp.cocktail.room;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.ArrayList;

//Entity for the Room database we will cache responses into
@Entity(tableName = "cocktails")
public class CocktailCacheEntity {

    // our primary Keys will be drink IDs
    // primary key can not be null
    @PrimaryKey(autoGenerate = false)
    @NonNull
    @ColumnInfo(name = "drinkID")
    private String drinkID;

    @ColumnInfo(name = "drinkName")
    private String drinkName;

    @ColumnInfo(name = "drinkCategory")
    private String drinkCategory;

    @ColumnInfo(name = "drinkGlass")
    private String drinkGlass;

    @ColumnInfo(name = "drinkInstructions")
    private String drinkInstructions;

    @ColumnInfo(name = "drinkImage")
    private String drinkImage;

//    @ColumnInfo(name = "strIng1")
////    private String ing1;
////
////    @ColumnInfo(name = "strIng2")
////    private String ing2;
////
////    @ColumnInfo(name = "strIng3")
////    private String ing3;
////
////    @ColumnInfo(name = "strIng4")
////    private String ing4;
////
////    @ColumnInfo(name = "strIng5")
////    private String ing5;
////
////    @ColumnInfo(name = "strIng6")
////    private String ing6;
////
////    @ColumnInfo(name = "strIng7")
////    private String ing7;
////
////    @ColumnInfo(name = "strIng8")
////    private String ing8;
////
////    @ColumnInfo(name = "strIng9")
////    private String ing9;
////
////    @ColumnInfo(name = "strIng10")
////    private String ing10;
////
////    @ColumnInfo(name = "strIng11")
////    private String ing11;
////
////    @ColumnInfo(name = "strIng12")
////    private String ing12;
////
////    @ColumnInfo(name = "strIng13")
////    private String ing13;
////
////    @ColumnInfo(name = "strIng14")
////    private String ing14;
////
////    @ColumnInfo(name = "strIng15")
////    private String ing15;
////
////    @ColumnInfo(name = "strMsr1")
////    private String msr1;
////
////    @ColumnInfo(name = "strMsr2")
////    private String msr2;
////
////    @ColumnInfo(name = "strMsr3")
////    private String msr3;
////
////    @ColumnInfo(name = "strMsr4")
////    private String msr4;
////
////    @ColumnInfo(name = "strMsr5")
////    private String msr5;
////
////    @ColumnInfo(name = "strMsr6")
////    private String msr6;
////
////    @ColumnInfo(name = "strMsr7")
////    private String msr7;
////
////    @ColumnInfo(name = "strMsr8")
////    private String msr8;
////
////    @ColumnInfo(name = "strMsr9")
////    private String msr9;
////
////    @ColumnInfo(name = "strMsr10")
////    private String msr10;
////
////    @ColumnInfo(name = "strMsr11")
////    private String msr11;
////
////    @ColumnInfo(name = "strMsr12")
////    private String msr12;
////
////    @ColumnInfo(name = "strMsr13")
////    private String msr13;
////
////    @ColumnInfo(name = "strMsr14")
////    private String msr14;
////
////    @ColumnInfo(name = "strMsr15")
////    private String msr15;
////
////    private ArrayList<String> ingList;

    CocktailCacheEntity(String drinkID, String drinkName, String drinkCategory, String drinkGlass,
                        String drinkInstructions, String drinkImage){
        this.drinkID = drinkID;
        this.drinkName = drinkName;
        this.drinkCategory = drinkCategory;
        this.drinkGlass = drinkGlass;
        this.drinkInstructions = drinkInstructions;
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

    public String getDrinkID() {
        return drinkID;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public String getDrinkCategory() {
        return drinkCategory;
    }

    public String getDrinkGlass() {
        return drinkGlass;
    }

    public String getDrinkInstructions() {
        return drinkInstructions;
    }

    public String getDrinkImage() {
        return drinkImage;
    }

//    public ArrayList<String> getIngList() {
//        return ingList;
//    }
//
//    public String getIng1() {
//        return ing1;
//    }
//
//    public String getIng2() {
//        return ing2;
//    }
//
//    public String getIng3() {
//        return ing3;
//    }
//
//    public String getIng4() {
//        return ing4;
//    }
//
//    public String getIng5() {
//        return ing5;
//    }
//
//    public String getIng6() {
//        return ing6;
//    }
//
//    public String getIng7() {
//        return ing7;
//    }
//
//    public String getIng8() {
//        return ing8;
//    }
//
//    public String getIng9() {
//        return ing9;
//    }
//
//    public String getIng10() {
//        return ing10;
//    }
//
//    public String getIng11() {
//        return ing11;
//    }
//
//    public String getIng12() {
//        return ing12;
//    }
//
//    public String getIng13() {
//        return ing13;
//    }
//
//    public String getIng14() {
//        return ing14;
//    }
//
//    public String getIng15() {
//        return ing15;
//    }
//
//    public String getMsr1() {
//        return msr1;
//    }
//
//    public String getMsr2() {
//        return msr2;
//    }
//
//    public String getMsr3() {
//        return msr3;
//    }
//
//    public String getMsr4() {
//        return msr4;
//    }
//
//    public String getMsr5() {
//        return msr5;
//    }
//
//    public String getMsr6() {
//        return msr6;
//    }
//
//    public String getMsr7() {
//        return msr7;
//    }
//
//    public String getMsr8() {
//        return msr8;
//    }
//
//    public String getMsr9() {
//        return msr9;
//    }
//
//    public String getMsr10() {
//        return msr10;
//    }
//
//    public String getMsr11() {
//        return msr11;
//    }
//
//    public String getMsr12() {
//        return msr12;
//    }
//
//    public String getMsr13() {
//        return msr13;
//    }
//
//    public String getMsr14() {
//        return msr14;
//    }
//
//    public String getMsr15() {
//        return msr15;
//    }

    public void setDrinkID(@NonNull String drinkID) {
        this.drinkID = drinkID;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public void setDrinkCategory(String drinkCategory) {
        this.drinkCategory = drinkCategory;
    }

    public void setDrinkGlass(String drinkGlass) {
        this.drinkGlass = drinkGlass;
    }

    public void setDrinkInstructions(String drinkInstructions) {
        this.drinkInstructions = drinkInstructions;
    }

    public void setDrinkImage(String drinkImage) {
        this.drinkImage = drinkImage;
    }

//    public void setIng1(String ing1) {
//        this.ing1 = ing1;
//    }
//
//    public void setIng2(String ing2) {
//        this.ing2 = ing2;
//    }
//
//    public void setIng3(String ing3) {
//        this.ing3 = ing3;
//    }
//
//    public void setIng4(String ing4) {
//        this.ing4 = ing4;
//    }
//
//    public void setIng5(String ing5) {
//        this.ing5 = ing5;
//    }
//
//    public void setIng6(String ing6) {
//        this.ing6 = ing6;
//    }
//
//    public void setIng7(String ing7) {
//        this.ing7 = ing7;
//    }
//
//    public void setIng8(String ing8) {
//        this.ing8 = ing8;
//    }
//
//    public void setIng9(String ing9) {
//        this.ing9 = ing9;
//    }
//
//    public void setIng10(String ing10) {
//        this.ing10 = ing10;
//    }
//
//    public void setIng11(String ing11) {
//        this.ing11 = ing11;
//    }
//
//    public void setIng12(String ing12) {
//        this.ing12 = ing12;
//    }
//
//    public void setIng13(String ing13) {
//        this.ing13 = ing13;
//    }
//
//    public void setIng14(String ing14) {
//        this.ing14 = ing14;
//    }
//
//    public void setIng15(String ing15) {
//        this.ing15 = ing15;
//    }
//
//    public void setMsr1(String msr1) {
//        this.msr1 = msr1;
//    }
//
//    public void setMsr2(String msr2) {
//        this.msr2 = msr2;
//    }
//
//    public void setMsr3(String msr3) {
//        this.msr3 = msr3;
//    }
//
//    public void setMsr4(String msr4) {
//        this.msr4 = msr4;
//    }
//
//    public void setMsr5(String msr5) {
//        this.msr5 = msr5;
//    }
//
//    public void setMsr6(String msr6) {
//        this.msr6 = msr6;
//    }
//
//    public void setMsr7(String msr7) {
//        this.msr7 = msr7;
//    }
//
//    public void setMsr8(String msr8) {
//        this.msr8 = msr8;
//    }
//
//    public void setMsr9(String msr9) {
//        this.msr9 = msr9;
//    }
//
//    public void setMsr10(String msr10) {
//        this.msr10 = msr10;
//    }
//
//    public void setMsr11(String msr11) {
//        this.msr11 = msr11;
//    }
//
//    public void setMsr12(String msr12) {
//        this.msr12 = msr12;
//    }
//
//    public void setMsr13(String msr13) {
//        this.msr13 = msr13;
//    }
//
//    public void setMsr14(String msr14) {
//        this.msr14 = msr14;
//    }
//
//    public void setMsr15(String msr15) {
//        this.msr15 = msr15;
//    }
}
