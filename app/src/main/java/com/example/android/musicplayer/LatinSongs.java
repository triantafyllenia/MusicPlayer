package com.example.android.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import android.widget.ListView;

public class LatinSongs extends AppCompatActivity {

    Button back;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latin_songs);

// Create an array of Latin Songs

        ArrayList<AndroidLatin> androidLatinArrayList = new ArrayList<AndroidLatin>();
        androidLatinArrayList.add(new AndroidLatin("Quesiste", "3:06"));
        androidLatinArrayList.add(new AndroidLatin("samba de janeiro", "2:58"));
        androidLatinArrayList.add(new AndroidLatin("2 gynaikes", "3:06"));
        androidLatinArrayList.add(new AndroidLatin("cha cha cha peirasmos", "3:40"));
        androidLatinArrayList.add(new AndroidLatin("tango alexiou", "3:30"));
    }
    AndroidLatin androidLatin = new AndroidLatin(this, androidLatin);

    // Get a reference to the ListView, and attach the adapter to the listView.

    ListView listView = (ListView) findViewById(R.id.listview_flavor);
        listView.setAdapter();
}

    public void setonBackOnButton() {

        final Context onBack = this;

        back =(Button) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(onBack, MainActivity.class);
                startActivity(intent);

            }
        });

    }
}
