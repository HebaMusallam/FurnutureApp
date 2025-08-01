package com.example.farnuture;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class chair2 extends AppCompatActivity {

    View imageView15; //profile icon
    View imageView12; //home icon

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chair2);
        imageView15 = findViewById(R.id.imageView15);
        imageView12 = findViewById(R.id.imageView12);

        imageView12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(),home.class);
                        startActivity(i);
                    }
                }
        );


        imageView15.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(),profile.class);
                        startActivity(i);
                    }
                }
        );
    }
}