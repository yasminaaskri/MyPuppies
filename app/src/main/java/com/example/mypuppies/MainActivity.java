package com.example.mypuppies;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = findViewById(R.id.listView);


        List<Chien> chienList = new ArrayList<>();
        chienList.add(new Chien("dog1", "Golden Retriever", "Sporting", "United Kingdom"));
        chienList.add(new Chien("dog2", "German Shepherd", "Herding", "Germany"));
        chienList.add(new Chien("dog3", "Bulldog", "Non-Sporting", "England"));
        chienList.add(new Chien("dog4", "Beagle", "Hound", "England"));



        MyAdapter adapter = new MyAdapter(this, chienList);
        listView.setAdapter(adapter);
    }
}
