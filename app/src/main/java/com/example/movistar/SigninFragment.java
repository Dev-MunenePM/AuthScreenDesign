package com.example.movistar;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.appcompat.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class SigninFragment extends Fragment {


        public SigninFragment() {
            // Required empty public constructor
        }

        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View rootView = inflater.inflate(R.layout.fragment_signin, container, false);

            // Find the NavController
            NavHostFragment navHostFragment = (NavHostFragment) requireActivity().getSupportFragmentManager()
                    .findFragmentById(R.id.nav_host_fragment);
            NavController navController = navHostFragment.getNavController();

            // Initialize the Button
            Button signupButton = rootView.findViewById(R.id.signUpButton);

            //Initialize textview
            TextView forget_Password = rootView.findViewById(R.id.forgetPassword);

            // Set OnClickListener for the Button
            signupButton.setOnClickListener(v -> {
                // Navigate to the sign-up fragment using NavController
                navController.navigate(R.id.signupFragment);
            });
            // Set OnClickListener for Forget Password
            forget_Password.setOnClickListener(v -> {
                // Navigate to the sign-up fragment using NavController
                navController.navigate(R.id.forgetpasswordFragment);
            });

            return rootView;
        }
    }
