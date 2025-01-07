package com.example.mypuppies;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView nameText = findViewById(R.id.infoName);
        TextView breedText = findViewById(R.id.infoBreed);
        TextView originText = findViewById(R.id.infoOrigin);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String breed = intent.getStringExtra("breed");
        String origin = intent.getStringExtra("origin");

        Log.d("InfoActivity", "Name: " + name);
        Log.d("InfoActivity", "Breed: " + breed);
        Log.d("InfoActivity", "Origin: " + origin);

        nameText.setText("Name: " + name);
        breedText.setText("Breed: " + breed);
        originText.setText("Origin: " + origin);
    }
}
