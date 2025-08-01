package com.example.farnuture;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    View constraintLayout;
    View cl2;
    View constraintLayout2;
    View constraintLayout4;
    View imageView12; //home icon
    View imageView15; //profile icon

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        constraintLayout = findViewById(R.id.constraintLayout);
        cl2 = findViewById(R.id.cl2);
        constraintLayout2 = findViewById(R.id.constraintLayout2);
        constraintLayout4 = findViewById(R.id.constraintLayout4);
        imageView15 = findViewById(R.id.imageView15);

        constraintLayout.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(),chair1.class);
                        startActivity(i);
                    }
                }
        );


        cl2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(),chair2.class);
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



        constraintLayout2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(),chair3.class);
                        startActivity(i);
                    }
                }
        );


        constraintLayout4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(),chair4.class);
                        startActivity(i);
                    }
                }
        );

    }
}