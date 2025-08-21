package com.example.farnuture;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {

    Button button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"acount created succsfully", Toast.LENGTH_SHORT).show();
                        Intent x = new Intent(getApplicationContext(), home.class);
                        startActivity(x);
                    }
                }
        );


        button5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(),login.class);
                        startActivity(i);
                    }
                }
        );

    }
}