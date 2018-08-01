package com.example.pc.mtmusicplayer;

import java.util.ArrayList;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class Playlist_Adapter extends ArrayAdapter<PlayListClass> {

    public Playlist_Adapter(Activity context, ArrayList<PlayListClass> playlist_classes) {
        super(context, 0, playlist_classes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        PlayListClass currentPlaylist = getItem(position);

        TextView song_textview = (TextView) listItemView.findViewById(R.id.song_textview);

        song_textview.setText(currentPlaylist.getsongname());


        TextView singer_textview = (TextView) listItemView.findViewById(R.id.singer_textview);

        singer_textview.setText(currentPlaylist.getsinger());


        return listItemView;
    }
}
