package com.example.atmos4cast;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.atmos4cast.R;

public class LoginActivity extends AppCompatActivity {

    private EditText emailInput, passwordInput;
    private Button loginButton;
    private TextView loginTitle, registerLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        registerLink = findViewById(R.id.register_link);
        registerLink.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        });

        loginTitle = findViewById(R.id.login_title);
        animateText("Welcome Back!");
        emailInput = findViewById(R.id.email_input);
        passwordInput = findViewById(R.id.password_input);
        loginButton = findViewById(R.id.login_button);

        animateViews();
    }

    private void animateViews() {
        ObjectAnimator fadeInEmail = ObjectAnimator.ofFloat(emailInput, "translationY", -100f, 0f);
        fadeInEmail.setDuration(500);
        fadeInEmail.start();

        ObjectAnimator fadeInPassword = ObjectAnimator.ofFloat(passwordInput, "translationY", -100f, 0f);
        fadeInPassword.setDuration(500);
        fadeInPassword.setStartDelay(100);
        fadeInPassword.start();

        ObjectAnimator fadeInButton = ObjectAnimator.ofFloat(loginButton, "translationY", -100f, 0f);
        fadeInButton.setDuration(500);
        fadeInButton.setStartDelay(200);
        fadeInButton.start();
    }

    private void animateText(String text) {
        ValueAnimator animator = ValueAnimator.ofInt(0, text.length());
        animator.setDuration(2000); // Adjust duration for speed
        animator.addUpdateListener(animation -> {
            int index = (int) animation.getAnimatedValue();
            loginTitle.setText(text.substring(0, index));
        });
        animator.start();
    }
}
