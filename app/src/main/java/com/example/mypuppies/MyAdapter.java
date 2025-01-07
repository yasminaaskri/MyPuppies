package com.example.mypuppies;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private List<Chien> chienList;


    public MyAdapter(Context context, List<Chien> chienList) {
        this.context = context;
        this.chienList = chienList;
    }

    @Override
    public int getCount() {
        return chienList.size();
    }

    @Override
    public Object getItem(int position) {
        return chienList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.display, parent, false);
        }


        Chien chien = chienList.get(position);


        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView nameText = convertView.findViewById(R.id.nameText);
        TextView breedText = convertView.findViewById(R.id.breedText);
        TextView originText = convertView.findViewById(R.id.originText);


        int imageResId = context.getResources().getIdentifier(chien.getImageName(), "drawable", context.getPackageName());


        Log.d("MyAdapter", "Image Resource ID for " + chien.getImageName() + ": " + imageResId);


        if (imageResId != 0) {
            imageView.setImageResource(imageResId);
        } else {

            Toast.makeText(context, "Image not found: " + chien.getImageName(), Toast.LENGTH_SHORT).show();
        }


        nameText.setText(chien.getName());
        breedText.setText(chien.getBreed());
        originText.setText(chien.getOrigin());


        imageView.setOnClickListener(v -> {
            Intent intent = new Intent(context, InfoActivity.class);
            intent.putExtra("name", chien.getName());
            intent.putExtra("breed", chien.getBreed());
            intent.putExtra("origin", chien.getOrigin());
            // Ensure you're starting the activity correctly
            context.startActivity(intent);
        });


        return convertView;
    }
}
