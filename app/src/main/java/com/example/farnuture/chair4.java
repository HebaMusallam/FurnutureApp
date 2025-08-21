package com.example.farnuture;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class chair4 extends AppCompatActivity {
    View imageView15; //profile icon
    View imageView12; //home icon

    View imageView13; //Favorite icon

    View btnCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chair4);
        imageView15 = findViewById(R.id.imageView15);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);
        btnCart = findViewById(R.id.btnCart);

        imageView12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), home.class);
                        startActivity(i);
                    }
                }
        );


        imageView15.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), Profile.class);
                        startActivity(i);
                    }
                }
        );
        imageView13.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), Favorite.class);
                        startActivity(i);
                    }
                }
        );
        btnCart.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), cart.class);
                        startActivity(i);
                    }
                }
        );

    }
}