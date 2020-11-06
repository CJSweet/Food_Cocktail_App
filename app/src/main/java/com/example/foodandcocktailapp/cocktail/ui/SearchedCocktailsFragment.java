package com.example.foodandcocktailapp.cocktail.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import com.example.foodandcocktailapp.cocktail.room.CocktailCacheEntity;
import com.example.foodandcocktailapp.cocktail.util.Cocktail;
import com.example.foodandcocktailapp.databinding.CocktailListingsFragmentBinding;

import java.util.List;

public class SearchedCocktailsFragment extends Fragment implements DrinksAdapter.OnDrinkClickListener {
    private static final String TAG = "SearchedCocktailsFragme";
    private CocktailListingsFragmentBinding binding;
    private SearchedCocktailViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = CocktailListingsFragmentBinding.inflate(inflater, container, false);

        viewModel = new ViewModelProvider.AndroidViewModelFactory(requireActivity().getApplication()).create(SearchedCocktailViewModel.class);

        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

        DrinksAdapter drinksAdapter = new DrinksAdapter(this);

        binding.recyclerviewDrinks.setAdapter(drinksAdapter);

        viewModel.getAllCocktails().observe(requireActivity(), new Observer<List<CocktailCacheEntity>>() {
            @Override
            public void onChanged(List<CocktailCacheEntity> entities) {
                drinksAdapter.setCocktails(entities);
            }
        });

        return binding.getRoot();
    }

    @Override
    public void onDrinkClick(int position) {
        // Where to navigate to detailed drink page
        List<CocktailCacheEntity> drinks = viewModel.getAllCocktails().getValue();
//        String selectedDrinkName = drinks.get(position).getDrinkName();
//        String selectedImage = drinks.get(position).getDrinkImage();
//
//        Log.d(TAG, "onDrinkClick: " + selectedDrinkName);

        CocktailCacheEntity cocktailCacheEntity = drinks.get(position);
        Cocktail selected = new Cocktail(
                cocktailCacheEntity.getDrinkID(),
                cocktailCacheEntity.getDrinkName(),
                cocktailCacheEntity.getDrinkCategory(),
                cocktailCacheEntity.getDrinkGlass(),
                cocktailCacheEntity.getDrinkInstructions(),
                cocktailCacheEntity.getDrinkImage());

        NavDirections action =
                SearchedCocktailsFragmentDirections
                .actionSearchedCocktailsFragmentToCocktailDetailFragment(selected);

        Navigation.findNavController(requireView()).navigate(action);

    }
}
