package com.example.farnuture;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    View constraintLayout;
    View cl2;
    View constraintLayout2;
    View constraintLayout4;
    View btnHome;     // home icon
    View btnFavorite; // favorite icon
    View btnProfile;  // profile icon

    View btnCart; //Cart icon

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        constraintLayout = findViewById(R.id.constraintLayout);
        cl2 = findViewById(R.id.cl2);
        constraintLayout2 = findViewById(R.id.constraintLayout2);
        constraintLayout4 = findViewById(R.id.constraintLayout4);

        btnHome = findViewById(R.id.btnHome);
        btnFavorite = findViewById(R.id.btnFavorite);
        btnProfile = findViewById(R.id.btnProfile);
        btnCart = findViewById(R.id.btnCart);

        // التنقل إلى صفحات الكراسي
        constraintLayout.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), chair1.class);
            startActivity(i);
        });

        cl2.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), chair2.class);
            startActivity(i);
        });

        constraintLayout2.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), chair3.class);
            startActivity(i);
        });

        constraintLayout4.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), chair4.class);
            startActivity(i);
        });

        // التنقل إلى صفحات أخرى
        btnFavorite.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), Favorite.class);
            startActivity(i);
        });

        btnProfile.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), Profile.class);
            startActivity(i);
        });
        btnCart.setOnClickListener(view -> {
            Intent i = new Intent(home.this, cart.class);
            startActivity(i);
        });

        // لا تضف listener للـ btnHome لأنك بالفعل في الصفحة الرئيسية
    }
}
