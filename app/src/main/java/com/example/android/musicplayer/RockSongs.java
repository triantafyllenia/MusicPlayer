package com.example.android.musicplayer;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class RockSongs extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_songs);

        // Create an array of Rock Songs

        String[] rockSongs = new String[5];
        rockSongs[0] = "rock 1";
        rockSongs[1] = "rock 2";
        rockSongs[2] = "rock 3";
        rockSongs[3] = "rock 4";
        rockSongs[4] = "rock 5";

        setonBackOnButton();

    }

    public void setonBackOnButton() {

        final Context onBack = this;

        back =(Button) findViewById(R.id.back);

        back.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(onBack, MainActivity.class);
                startActivity(intent);

            }
        });

    }
}
