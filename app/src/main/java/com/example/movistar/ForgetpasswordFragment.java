package com.example.movistar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ForgetpasswordFragment extends Fragment {

    private Button signinButton;
    private Button signupButton;

    public ForgetpasswordFragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_forgetpassword, container, false);

        // Find the NavController
        NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

        // Initialize the Button
        signinButton = rootView.findViewById(R.id.signInButton);
        signupButton = rootView.findViewById(R.id.signUpButton);

        // Set OnClickListener for the Buttons
        signinButton.setOnClickListener(v -> {
            // Navigate to the sign-in fragment using NavController
            Navigation.findNavController(requireView()).navigate(R.id.signinFragment);
        });
        signupButton.setOnClickListener(v -> {
            // Navigate to the sign-in fragment using NavController
            Navigation.findNavController(requireView()).navigate(R.id.signupFragment);
        });

        return rootView;
    }
}