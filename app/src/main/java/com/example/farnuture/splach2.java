package com.example.farnuture;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class splach2 extends AppCompatActivity {

    ImageView imv1, imv2, imv3;

    Button bt1, bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach2);
        imv1 = findViewById(R.id.imv1);
        imv2 = findViewById(R.id.imv2);
        imv3 = findViewById(R.id.imv3);

        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);


        imv2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(),splach.class);
                        startActivity(i);
                    }
                }
        );

        imv1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(i);
                    }
                }
        );

        bt1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(),login.class);
                        startActivity(i);
                    }
                }
        );

        bt2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(),signup.class);
                        startActivity(i);
                    }
                }
        );


    }

}
