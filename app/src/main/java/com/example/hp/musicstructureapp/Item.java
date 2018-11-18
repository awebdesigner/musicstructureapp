package com.example.hp.musicstructureapp;

public class Item {
    private String Title;
    private String Artist;
    private String Album;
    private int itemIcon;

    public Item(String Title, String Artist, String Album) {
        Title = Title;
        Artist = Artist;
        Album = Album;
        itemIcon = itemIcon;
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

}
