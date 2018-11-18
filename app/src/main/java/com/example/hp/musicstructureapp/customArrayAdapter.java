package com.example.hp.musicstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class customArrayAdapter extends ArrayAdapter<Item> {
    public customArrayAdapter(Activity context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Item currentItem = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.item_title);
        titleTextView.setText(currentItem.getTitle());

        TextView subTitleView = (TextView) listItemView.findViewById(R.id.item_sub_title);
        subTitleView.setText(currentItem.getAlbum());

        return listItemView;
    }
}
