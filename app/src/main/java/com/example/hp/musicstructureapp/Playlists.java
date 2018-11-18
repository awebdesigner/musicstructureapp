package com.example.hp.musicstructureapp;

import android.arch.lifecycle.Lifecycle;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Playlists extends Fragment {
    @Override
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        String playlists[] = {"Gospel", "Wedding", "Birthday Party", "Meditation",  "Workout",  "National Anthems","Inspirational audio books",  "French tutorials",  "Luganda Tutorials","Recordings"};

        View view = inflater.inflate(R.layout.playlists,container,false);

        ListView playlistsView = (ListView)view.findViewById(R.id.playlists_list_view );

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, playlists);
        playlistsView.setAdapter(listViewAdapter);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(R.string.action_playlists);
    }
}
