package com.example.android.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class AndroidRockAdapter extends ArrayAdapter<AndroidRockSongs> {

    public AndroidRockAdapter(Activity context, ArrayList<AndroidRockSongs> androidRock) {
        super(context, 0, androidRock);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_rock_songs, parent, false);
        }

        AndroidRockSongs currentAndroidFlavor = getItem(position);

        TextView titleTextView = listItemView.findViewById(R.id.artist_name);

        if (currentAndroidFlavor != null) {
            titleTextView.setText(currentAndroidFlavor.getTitleName());
        }

        TextView artistTextView = listItemView.findViewById(R.id.song_name);

        if (currentAndroidFlavor != null) {
            artistTextView.setText(currentAndroidFlavor.getArtistName());
        }

        TextView durationView = listItemView.findViewById(R.id.song_duration);

        if (currentAndroidFlavor != null) {
            durationView.setText(currentAndroidFlavor.getDuration());
        }

        return listItemView;
    }


}
