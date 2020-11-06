package com.example.foodandcocktailapp.cocktail.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.foodandcocktailapp.R;
import com.example.foodandcocktailapp.cocktail.room.CocktailCacheEntity;
import com.example.foodandcocktailapp.cocktail.util.Cocktail;

import java.util.ArrayList;
import java.util.List;

public class DrinksAdapter extends RecyclerView.Adapter<DrinksAdapter.DrinkHolder> {

    private List<CocktailCacheEntity> cocktails = new ArrayList<>();
    private OnDrinkClickListener onDrinkClickListener;

    public DrinksAdapter(OnDrinkClickListener onDrinkClickListener){
        this.onDrinkClickListener = onDrinkClickListener;
    }

    @NonNull
    @Override
    public DrinkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cocktail_cardview, parent, false);

        return new DrinkHolder(itemView, onDrinkClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull DrinkHolder holder, int position) {
        CocktailCacheEntity currentCocktail = cocktails.get(position);
        holder.drinkName.setText(currentCocktail.getDrinkName());
        Glide.with(holder.itemView).load(currentCocktail.getDrinkImage()).into(holder.drinkImage);
    }

    @Override
    public int getItemCount() {
        return cocktails.size();
    }

    public void setCocktails(List<CocktailCacheEntity> cocktails){
        this.cocktails = cocktails;
        notifyDataSetChanged();
    }

    class DrinkHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView drinkName;
        private ImageView drinkImage;
        OnDrinkClickListener onDrinkClickListener;


        public DrinkHolder(@NonNull View itemView, OnDrinkClickListener onDrinkClickListener) {
            super(itemView);
            drinkName = itemView.findViewById(R.id.cardview_drink_name);
            drinkImage = itemView.findViewById(R.id.cardview_drink_image);
            this.onDrinkClickListener = onDrinkClickListener;

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            onDrinkClickListener.onDrinkClick(getAdapterPosition());
        }
    }

    // for when clicking the drink in recyclerview
    public interface OnDrinkClickListener{
        void onDrinkClick(int position);
    }
}
