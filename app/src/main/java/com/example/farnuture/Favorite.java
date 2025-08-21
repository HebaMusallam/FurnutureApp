package com.example.farnuture;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.core.view.WindowInsetsCompat;
import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import com.example.farnuture.adapters.FavoriteAdapter;
import com.example.farnuture.models.FavoriteItem;

import java.util.ArrayList;
import java.util.List;

public class Favorite extends AppCompatActivity {

    ListView listFavorites;
    FavoriteAdapter adapter;
    List<FavoriteItem> favoriteItems;

    View btnFavorite;
    View btnProfile;
    View btnHome;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_favorite);

        // ربط الأزرار
        btnHome = findViewById(R.id.btnHome);
        btnFavorite = findViewById(R.id.btnFavorite); // لا نضيف لها OnClick لأنها الصفحة الحالية
        btnProfile = findViewById(R.id.btnProfile);

        btnHome.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), home.class);
            startActivity(i);
        });

        btnProfile.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), Profile.class);
            startActivity(i);
        });

        // تهيئة الـ insets للـ EdgeToEdge
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // تجهيز قائمة المفضلة
        listFavorites = findViewById(R.id.listFavorites);

        favoriteItems = new ArrayList<>();
        favoriteItems.add(new FavoriteItem(R.drawable.chair, "Modern Chair", "(3.2)", "150$"));
        favoriteItems.add(new FavoriteItem(R.drawable.table, "Simple Chair", "(3.4)", "150$"));
        favoriteItems.add(new FavoriteItem(R.drawable.mirror, "Comfort Chair", "(3.4)", "259$"));
        favoriteItems.add(new FavoriteItem(R.drawable.sofa, "Double Chair", "(3.4)", "259$"));

        adapter = new FavoriteAdapter(this, favoriteItems);
        listFavorites.setAdapter(adapter);
    }
}
