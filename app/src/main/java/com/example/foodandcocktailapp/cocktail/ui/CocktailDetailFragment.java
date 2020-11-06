package com.example.foodandcocktailapp.cocktail.ui;

import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bumptech.glide.Glide;
import com.example.foodandcocktailapp.R;
import com.example.foodandcocktailapp.cocktail.util.Cocktail;
import com.example.foodandcocktailapp.databinding.CocktailDetailedPageBinding;

public class CocktailDetailFragment extends Fragment {

    CocktailDetailedPageBinding binding;
    CocktailDetailViewModel viewModel;
    ImageView drinkImage;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = CocktailDetailedPageBinding.inflate(inflater, container, false);

        Cocktail selected = CocktailDetailFragmentArgs.fromBundle(getArguments()).getCocktail();
        CDetailViewModelFactory vmFactory = new CDetailViewModelFactory(selected);

        viewModel = new ViewModelProvider(this, vmFactory).get(CocktailDetailViewModel.class);

        binding.setViewModel(viewModel);

        binding.setLifecycleOwner(this);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        // Set image of detailed fragment
        drinkImage = (ImageView) requireActivity().findViewById(R.id.cdetailed_image);
        Glide.with(this).load(viewModel.getImageLink()).into(drinkImage);
    }
}
