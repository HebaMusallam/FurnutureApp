package com.example.farnuture;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    View btnHome;
    View btnFavorite;
    View btnProfile;
    View btnCart;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnHome = findViewById(R.id.btnHome);
        btnFavorite = findViewById(R.id.btnFavorite);
        btnProfile = findViewById(R.id.btnProfile);
        btnCart = findViewById(R.id.btnCart);

        btnHome.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), home.class);
            startActivity(intent);
        });
        btnCart.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), cart.class);
            startActivity(intent);
        });

        btnFavorite.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Favorite.class);
            startActivity(intent);
        });

        // لا تضيف listener على btnProfile لأننا في صفحة Profile حالياً
    }
}
