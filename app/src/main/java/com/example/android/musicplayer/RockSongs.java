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

        /*//Create a new ArrayList for titles
        List<String> rockTitle = new ArrayList<>();
        rockTitle.add("Wild Thing");
        rockTitle.add("Back to Black");
        rockTitle.add("No one like you");
        rockTitle.add("Summer of 69");
        rockTitle.add("Rock you like a Hurricane");

        //Create a new Arraylist for duration
        List<String> rockDuration = new ArrayList<>();
        rockDuration.add("3:40");
        rockDuration.add("2:10");
        rockDuration.add("3:10");
        rockDuration.add("3:45");
        rockDuration.add("3:25");

        //Get the size of arraylist rockSongs
        int length;
        length = rockTitle.size();

        //Create a new arraylist which will hold the values of title and duration
        ArrayList<String> rockSong = new ArrayList<>(length);


        //Add values of rockSongs and rockDuration on the third array rockSong
        for (int i = 0; i < length; i++)
        {
            rockSong.add(rockTitle.get(i)+ "         " +rockDuration.get(i));
        }

        ArrayAdapter<String> AndroidRock = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, rockSong);

        ListView listView = findViewById(R.id.rockList);
        listView.setAdapter(AndroidRock);
        */

        // Create an ArrayList of AndroidFlavor objects
        ArrayList<AndroidRockSongs> androidFlavors = new ArrayList<>();
        androidFlavors.add(new AndroidRockSongs("Donut", "1.6", "3:10"));
        androidFlavors.add(new AndroidRockSongs("Eclair", "2.0-2.1", "3:10"));
        androidFlavors.add(new AndroidRockSongs("Froyo", "2.2-2.2.3", "3:10"));
        androidFlavors.add(new AndroidRockSongs("GingerBread", "2.3-2.3.7", "3:10"));
        androidFlavors.add(new AndroidRockSongs("Honeycomb", "3.0-3.2.6", "3:10"));
        androidFlavors.add(new AndroidRockSongs("Ice Cream Sandwich", "4.0-4.0.4", "3:10"));
        androidFlavors.add(new AndroidRockSongs("Jelly Bean", "4.1-4.3.1", "3:10"));
        androidFlavors.add(new AndroidRockSongs("KitKat", "4.4-4.4.4", "3:10"));
        androidFlavors.add(new AndroidRockSongs("Lollipop", "5.0-5.1.1", "3:10"));
        androidFlavors.add(new AndroidRockSongs("Marshmallow", "6.0-6.0.1", "3:10"));

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