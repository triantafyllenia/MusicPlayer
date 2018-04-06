package com.example.android.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button onRock;
    Button onPop;
    Button onLatin;


    public void setonRockOnButton() {

        final Context rockSongs = this;

        onRock = (Button) findViewById(R.id.rock);

        onRock.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(rockSongs, RockSongs.class);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setonRockOnButton(); //this function goes to rock screen
        setonPopOnButton();  //this function goes to pop screen
        setonLatinOnButton(); //this function goes to latin screen
    }


    public void setonPopOnButton() {

        final Context popSongs = this;

        onPop = (Button) findViewById(R.id.pop);

        onPop.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(popSongs, PopSongs.class);
                startActivity(intent);

            }


        });
    }


    public void setonLatinOnButton() {

        final Context latinSongs = this;

        onLatin = (Button) findViewById(R.id.latin);

        onLatin.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(latinSongs, LatinSongs.class);
                startActivity(intent);

            }


        });
    }

}


