package com.example.movistar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


public class SignupFragment extends Fragment {


    private Button signinButton; // Declare the Button

    public SignupFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_signup, container, false);

        // Find the NavController
        NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

        // Initialize the Button
        signinButton = rootView.findViewById(R.id.signInButton);

        // Set OnClickListener for the Button
        signinButton.setOnClickListener(v -> {
            // Navigate to the sign-in fragment using NavController
            Navigation.findNavController(requireView()).navigate(R.id.signinFragment);
        });

        return rootView;
    }
}