package com.example.android.musicplayer;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RockSongs extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_songs);

        // Create an array of Rock Songs

        class AndroidRock {

            public AndroidRock(RockSongs rockSongs) {
            }

            public AndroidRock(String rockSongs, String duration) {

            }
            void f() {
                int i;
                i = 0;
            }
        }

        ArrayList<AndroidRock> androidRockArrayList= new ArrayList<AndroidRock>();
        androidRockArrayList.add(new AndroidRock("Wild Thing", "3:40"));
        androidRockArrayList.add(new AndroidRock("Back to Black", "3:33"));
        androidRockArrayList.add(new AndroidRock("No one like you", "3:35"));
        androidRockArrayList.add(new AndroidRock("Summer of 69", "2:55"));
        androidRockArrayList.add(new AndroidRock("Rock you like a Hurricane", "3:30"));

        AndroidRock androidRock = new AndroidRock(this);{

            // Get a reference to the ListView, and attach the adapter to the listView.

            ListView listView = (ListView) findViewById(R.id.listview_);

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