package com.example.android.musicplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class LatinSongs extends AppCompatActivity {

    Button back;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latin_songs);
        setonBackOnButton();

        List<String> latin = Arrays.asList("latin1", "latin2", "latin3");

        ArrayAdapter<String> AndroidLatin = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,latin );

        ListView listView = (ListView) findViewById(R.id.listview_);
        listView.setAdapter(AndroidLatin);

// Create an array of Latin Songs

        class AndroidLatin {

            public AndroidLatin(LatinSongs latinSongs) {
            }

            public AndroidLatin(String latinSongs, String duration) {

            }
            void f() {
            int i;
            i = 0;
        }
        }

        ArrayList<AndroidLatin> songsLatin = new ArrayList<AndroidLatin>();
        songsLatin.add(new AndroidLatin("Quesiste", "3:06"));
        songsLatin.add(new AndroidLatin("samba de Janeiro", "2:58"));
        songsLatin.add(new AndroidLatin("2 gynaikes", "3:06"));
        songsLatin.add(new AndroidLatin("cha cha cha peirasmos", "3:40"));
        songsLatin.add(new AndroidLatin("tango alexiou", "3:30"));

    AndroidLatin androidLatin = new AndroidLatin(this);{

            @SuppressLint("WrongViewCast") LinearLayout latinView = (LinearLayout) findViewById(R.id.latin);

            int index = 0;
            while (index < latin.size()) {
                TextView wordView = new TextView(this);
                wordView.setText((CharSequence) songsLatin.get(index));
                latinView.addView(wordView);
                index++;

            }
            // Get a reference to the ListView, and attach the adapter to the listView.

            ListView songs = (ListView) findViewById(R.id.listview_);

            listView.setAdapter((ListAdapter) listView);
}
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
