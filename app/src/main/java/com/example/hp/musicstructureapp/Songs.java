package com.example.hp.musicstructureapp;

import android.arch.lifecycle.Lifecycle;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class Songs extends Fragment {


    @Override
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.songs,container,false);
        ListView songsView = (ListView)view.findViewById(R.id.songs_list_view );

        ArrayList<Music> songs = new ArrayList<Music>();
        songs.add(new Music("Uganda National Anthem","G.William K","Unknown Album",android.R.drawable.ic_media_play));
        songs.add(new Music("Amazing Grace","Hillsong","Amazing Grace",android.R.drawable.ic_media_play));
        songs.add(new Music("Gypsy","Shakira","Unknown Album",android.R.drawable.ic_media_play));
        songs.add(new Music("You're Great","Steve Crown","Unknown Album",android.R.drawable.ic_media_play));
        songs.add(new Music("Sabisanira","Twina Herbert","Praise",android.R.drawable.ic_media_play));

        customArrayAdapter songAdapter = new customArrayAdapter(getActivity(),songs);
        songsView.setAdapter(songAdapter);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(R.string.action_songs);

    }
}
