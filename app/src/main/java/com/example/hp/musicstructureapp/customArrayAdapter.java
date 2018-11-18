package com.example.hp.musicstructureapp;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class customArrayAdapter extends ArrayAdapter<Music> {
    Context myContext;
    public customArrayAdapter(Context context, ArrayList<Music> songs) {
        super(context, 0, songs);
        myContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Music Song = getItem(position);

        ImageView leftIconView = (ImageView) listItemView.findViewById(R.id.music_left_icon);
        leftIconView.setVisibility(View.GONE);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.music_title);
        titleTextView.setText(Song.getTitle());

        TextView subTitleView = (TextView) listItemView.findViewById(R.id.music_sub_title);
        subTitleView.setText( "Artist: "+ Song.getArtist() + ", Album: " + Song.getAlbum());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.action_icon);
        iconView.setImageResource(Song.getMusicImageResourceId());

        return listItemView;
    }
}
