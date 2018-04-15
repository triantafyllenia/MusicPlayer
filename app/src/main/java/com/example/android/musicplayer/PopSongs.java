package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class PopSongs extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_songs);
        setonBackOnButton();

        //Create a new ArrayList for titles
        List<String> popTitle = new ArrayList<>();
        popTitle.add("Zayn dusk till done");
        popTitle.add("Like a prayer");
        popTitle.add("Only Human");
        popTitle.add("I am in love with your body");
        popTitle.add("La vie  belle");

        //Create a new Arraylist for duration
        List<String> popDuration = new ArrayList<>();
        popDuration.add("3:40");
        popDuration.add("2:10");
        popDuration.add("3:10");
        popDuration.add("3:45");
        popDuration.add("3:25");

        //Get the size of arraylist popSongs
        int length;
        length = popTitle.size();

        //Create a new arraylist which will hold the values of title and duration
        ArrayList<String> popSong = new ArrayList<>(length);


        //Add values of popSongs and popDuration on the third array popSong
        for (int i = 0; i < length; i++)
        {
            popSong.add(popTitle.get(i)+ "         " +popDuration.get(i));
        }

        ArrayAdapter<String> AndroidPop = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, popSong);

        ListView listView = findViewById(R.id.listPop);
        listView.setAdapter(AndroidPop);

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
