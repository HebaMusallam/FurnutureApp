package com.example.farnuture;
import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.example.farnuture.fragments.CartList_Fragment;

public class cart extends AppCompatActivity {

    View btnHome, btnFavorite, btnCart, btnProfile;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        btnHome = findViewById(R.id.btnHome);
        btnFavorite = findViewById(R.id.btnFavorite);
        btnCart = findViewById(R.id.btnCart);
        btnProfile = findViewById(R.id.btnProfile);
//        FrameLayout fm = findViewById(R.id.cart_fragment_container);        // تحميل Fragment الخاص بالصفحة
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.cart_fragment_container, new CartList_Fragment())
                .commit();

        btnHome.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), home.class));
            overridePendingTransition(0, 0);
            finish();
        });

        btnFavorite.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Favorite.class));
            overridePendingTransition(0, 0);
            finish();
        });

        btnProfile.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), Profile.class));
            overridePendingTransition(0, 0);
            finish();
        });

        // لا تضيف listener على btnCraft لأنه الصفحة الحالية
        // لكن من الأفضل تمييز زر craft ليظهر أنه مفعل

//        // لتغيير لون زر craft أو تعديل شكله لتمييزه
//        btnCart.setAlpha(1f);


        // مثلا يكون ظاهر بقوة (مرئي)
//        btnHome.setAlpha(0.5f);
//        btnFavorite.setAlpha(0.5f);
//        btnProfile.setAlpha(0.5f);
    }


}
