package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class PopSongs extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_songs);


        // Create an array of Pop songs

        String[] popSongs = new String[5];
        popSongs[0] = "pop 1";
        popSongs[1] = "pop 2";
        popSongs[2] = "pop 3";
        popSongs[3] = "pop 4";
        popSongs[4] = "pop 5";

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
