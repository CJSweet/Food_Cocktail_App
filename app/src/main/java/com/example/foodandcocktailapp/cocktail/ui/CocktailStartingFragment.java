package com.example.foodandcocktailapp.cocktail.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import com.example.foodandcocktailapp.R;
import com.example.foodandcocktailapp.databinding.CocktailHomeFragmentBinding;


public class CocktailStartingFragment extends Fragment {
    private static final String TAG = "CocktailStartingFragment";

    Button CoNamBtn;
//    Button FiLetBtn;
//    Button InNamBtn;
//    Button CoIngBtn;
//    Button RandBtn;
//    Button HelpBtn;
//    Button RecentBtn;

    CocktailHomeFragmentBinding binding;
    CocktailStartingViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = CocktailHomeFragmentBinding.inflate(inflater, container, false);

        viewModel = new ViewModelProvider.AndroidViewModelFactory(requireActivity().getApplication()).create(CocktailStartingViewModel.class);

        binding.setViewModel(viewModel);

        // delete Room every time Fragment is created again, so that RecyclerView is not too full
        viewModel.deleteCocktails();

        binding.setLifecycleOwner(requireActivity());

        return binding.getRoot();
    }

    // Set the buttons to their IDs
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        CoNamBtn = (Button) requireView().findViewById(R.id.ch_cname_btn);
        CoNamBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlertDialog("Enter Cocktail Name", "s");
            }
        });
//        FiLetBtn = (Button) requireView().findViewById(R.id.ch_fletter_btn);
//        FiLetBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openAlertDialog("Enter First Letter", "f");
//            }
//        });
//        InNamBtn = (Button) requireView().findViewById(R.id.ch_iname_btn);
//        InNamBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openAlertDialog("Enter Ingredient for Information", "i");
//            }
//        });
//        CoIngBtn = (Button) requireView().findViewById(R.id.ch_cingred_btn);
//        CoIngBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openAlertDialog("Enter Ingredient for Cocktail", "i");
//            }
//        });
//        RandBtn = (Button) requireView().findViewById(R.id.ch_random_btn);
//        RandBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getRandomCocktail();
//            }
//        });
//        HelpBtn = (Button) requireView().findViewById(R.id.ch_help_btn);
//        HelpBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                launchHelperFragment();
//            }
//        });
//        RecentBtn = (Button) requireView().findViewById(R.id.ch_recents_btn);
//        RecentBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                seeRecentCocktails();
//            }
//        });
    }

    private void seeRecentCocktails() {
        // Display the cocktails that are in the cache
        Log.i("CocktailStartingFragment", "seeRecentCocktails: See what's in cache");
    }

    private void openAlertDialog(String title, String requestParam) {

        Log.i("CocktailStartingFragment", "openAlertDialog: Begin Alert Dialog Creation");

        // Create alert dialog for user to enter in the wanted information
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this.getContext());
        alertDialog.setTitle(title);

        final EditText input = new EditText(this.getContext());
        input.setHint("Enter here");
        alertDialog.setView(input);

        alertDialog.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // THis is where the API request will be launched
                        // but for now, Toast it
                        String enteredInfo = input.getText().toString();

                        Log.i("CocktailStartingFragment", "onClick: User entered message:" + enteredInfo);

                        viewModel.searchCocktails(enteredInfo);

                        // Navigate to RecyclerView
                        NavDirections action =
                                CocktailStartingFragmentDirections
                                .actionCocktailStartingFragmentToSearchedCocktailsFragment();
                        Navigation.findNavController(requireView()).navigate(action);
                    }
                });

        alertDialog.setNegativeButton("Cancel",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        alertDialog.show();
    }

//    // This method will be called when Random Cocktail button is selected
//    private void getRandomCocktail() {
//        Log.i("CocktailStartingFragment", "getRandomCocktail: Begin Random Cocktail");
//    }
//
//    // This method will be called when Help Me button is clicked
//    private void launchHelperFragment() {
//        Log.i("CocktailStartingFragment", "launchHelperFragment: Begin Helper Fragment");
//    }
}
