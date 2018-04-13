package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PopSongs extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_songs);
        setonBackOnButton();

        List<String> pop = Arrays.asList("pop1", "pop2", "pop3");

        ArrayAdapter<String> AndroidPop =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pop);

        ListView listView = (ListView) findViewById(R.id.listview_);
        listView.setAdapter(AndroidPop);


        // Create an array of Pop Songs

        class AndroidPop {

            public AndroidPop(PopSongs popSongs) {
            }

            public AndroidPop(String popSongs, String duration) {

            }

            void f() {
                int i;
                i = 0;
            }
        }

        ArrayList<AndroidPop> popSongs = new ArrayList<AndroidPop>();
        popSongs.add(new AndroidPop("Zayn dusk till done", "3:40"));
        popSongs.add(new AndroidPop("Like a prayer", "3:33"));
        popSongs.add(new AndroidPop("Only Human", "3:35"));
        popSongs.add(new AndroidPop("I am in love with your body", "2:55"));
        popSongs.add(new AndroidPop("La vie  belle", "3:30"));

        AndroidPop androidPop = new AndroidPop(this);
        {

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
