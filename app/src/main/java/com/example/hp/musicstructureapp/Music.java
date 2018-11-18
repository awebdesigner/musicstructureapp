package com.example.hp.musicstructureapp;

public class Music {
    private String Title;
    private String Artist;
    private String Album;
    private int imageResourceId;

    public Music(String mTitle, String mArtist, String mAlbum, int musicImageResourceId) {
        Title = mTitle;
        Artist = mArtist;
        Album = mAlbum;
        imageResourceId = musicImageResourceId;
    }

    public String getTitle(){
        return Title;
    }
    public String getArtist() {
        return Artist;
    }
    public String getAlbum() {
        return Album;
    }
    public int getMusicImageResourceId(){ return imageResourceId;}

}
