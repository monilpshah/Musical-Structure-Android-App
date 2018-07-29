package com.example.pc.mtmusicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        ArrayList<playlist_class> playlist_class = new ArrayList<playlist_class>();
        playlist_class p = new playlist_class("Dilbar", "Satyamev Jayate");
        playlist_class.add(p);

        playlist_class.add(new playlist_class("Dhadak title track", "Dhadak"));
        playlist_class.add(new playlist_class("Oh humsafar", "Oh humsafar"));
        playlist_class.add(new playlist_class("Bom diggy", "Bom diggy"));
        playlist_class.add(new playlist_class("Paniyon sa", "Satyamev Jayate"));
        playlist_class.add(new playlist_class("Naino Ne Bandhi", "Glod"));
        playlist_class.add(new playlist_class("Jitni Dafa", "Parmanu"));
        playlist_class.add(new playlist_class("kar Har Medan Fateh", "Sanju"));
        playlist_class.add(new playlist_class("High Rated Gabru", "Nawabzade"));
        playlist_class.add(new playlist_class("Tareefan", "Veere Di Wedding"));
        playlist_class.add(new playlist_class("Zingaat", "Dhadak"));
        playlist_class.add(new playlist_class("Buzz", "Buzz"));

        Playlist_Adapter itemsAdapter = new Playlist_Adapter (this, playlist_class);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
