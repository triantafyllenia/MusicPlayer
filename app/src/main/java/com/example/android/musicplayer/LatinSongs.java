package com.example.android.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;
import android.widget.ListView;


public class LatinSongs extends AppCompatActivity {

    Button back;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latin_songs);
        setonBackOnButton();

        //Create a new ArrayList for titles
        List<String> latinTitle = new ArrayList<>();
        latinTitle.add("Quesiste");
        latinTitle.add("samba de Janeiro");
        latinTitle.add("2 gynaikes");
        latinTitle.add("cha cha cha peirasmos");
        latinTitle.add("tango alexiou");

        //Create a new Arraylist for duration
        List<String> latinDuration = new ArrayList<>();
        latinDuration.add("3:10");
        latinDuration.add("2:55");
        latinDuration.add("3:45");
        latinDuration.add("3:18");
        latinDuration.add("3:33");

        //Get the size of arraylist latinSongs
        int length;
        length = latinTitle.size();

        //Create a new arraylist which will hold the values of title and duration
        ArrayList<String> latinSong = new ArrayList<>(length);


        //Add values of latinSongs and latinDuration on the third array latinSong
        for (int i = 0; i < length; i++)
        {
            latinSong.add(latinTitle.get(i)+ "         " +latinDuration.get(i));
        }

        ArrayAdapter<String> AndroidLatin = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,latinSong );

        ListView listView = findViewById(R.id.latinSongs);
        listView.setAdapter(AndroidLatin);

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
