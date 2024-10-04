package com.example.atmos4cast;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity {

    TextView loginLink, title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        loginLink = findViewById(R.id.login_link);

        loginLink.setOnClickListener(v -> {
            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(intent);
        });

        title = findViewById(R.id.title);
        title.setVisibility(View.INVISIBLE);
        title.postDelayed(() -> {
            title.setVisibility(View.VISIBLE);
            String text = "Create Account";
            ObjectAnimator animator = ObjectAnimator.ofFloat(title, "translationX", -500f, 0f);
            animator.setDuration(1000);
            animator.start();
        }, 300);
}}