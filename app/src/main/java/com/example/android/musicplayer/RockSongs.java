package com.example.android.musicplayer;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;

public class RockSongs extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_songs);
        setonBackOnButton();


        ArrayList<AndroidRockSongs> androidFlavors = new ArrayList<>();
        androidFlavors.add(new AndroidRockSongs("Eric Clapton", "Wild Thing", "3:10"));
        androidFlavors.add(new AndroidRockSongs("Scorpions", "Back to Black", "3:10"));
        androidFlavors.add(new AndroidRockSongs("Scorpions", "No one like you", "3:10"));
        androidFlavors.add(new AndroidRockSongs("Bryan Adams", "Summer of 69", "3:10"));


        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        AndroidRockAdapter flavorAdapter = new AndroidRockAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = findViewById(R.id.rockList);
        listView.setAdapter(flavorAdapter);

    }

    public void setonBackOnButton() {

        final Context onBack = this;

        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(onBack, MainActivity.class);
                startActivity(intent);

            }
        });

    }
}