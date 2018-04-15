package com.example.android.musicplayer;

public class AndroidRockSongs {

    private String rockArtistName;
    private String rockSongName;
    private String rockDuration;

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
