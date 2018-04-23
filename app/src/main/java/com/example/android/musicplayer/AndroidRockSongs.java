package com.example.android.musicplayer;

public class AndroidRockSongs {

    private final String rockArtistName;
    private final String rockSongName;
    private final String rockDuration;

    public AndroidRockSongs(String vName, String vTitle, String vDuration)
    {
        rockArtistName = vName;
        rockSongName = vTitle;
        rockDuration = vDuration;
    }

    public String getArtistName(){
        return rockArtistName;
    }

    public String getTitleName(){
        return rockSongName;
    }

    public String getDuration(){
        return rockDuration;
    }
}
