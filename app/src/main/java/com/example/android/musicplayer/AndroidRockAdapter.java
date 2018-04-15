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

        // Get the {@link AndroidFlavor} object located at this position in the list
        AndroidRockSongs currentAndroidFlavor = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView titleTextView = listItemView.findViewById(R.id.artist_name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        titleTextView.setText(currentAndroidFlavor.getTitleName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView artistTextView = listItemView.findViewById(R.id.song_name);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        artistTextView.setText(currentAndroidFlavor.getArtistName());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        TextView durationView = listItemView.findViewById(R.id.song_duration);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        durationView.setText(currentAndroidFlavor.getDuration());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }


}
