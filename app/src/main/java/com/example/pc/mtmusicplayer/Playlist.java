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

        ArrayList<PlayListClass > PlayListClass = new ArrayList<PlayListClass >();
        PlayListClass  p = new PlayListClass ("Dilbar", "Satyamev Jayate");
        PlayListClass.add(p);

        PlayListClass.add(new PlayListClass("Dhadak title track", "Dhadak"));
        PlayListClass.add(new PlayListClass("Oh humsafar", "Oh humsafar"));
        PlayListClass.add(new PlayListClass("Bom diggy", "Bom diggy"));
        PlayListClass.add(new PlayListClass("Paniyon sa", "Satyamev Jayate"));
        PlayListClass.add(new PlayListClass("Naino Ne Bandhi", "Glod"));
        PlayListClass.add(new PlayListClass("Jitni Dafa", "Parmanu"));
        PlayListClass.add(new PlayListClass("kar Har Medan Fateh", "Sanju"));
        PlayListClass.add(new PlayListClass("High Rated Gabru", "Nawabzade"));
        PlayListClass.add(new PlayListClass("Tareefan", "Veere Di Wedding"));
        PlayListClass.add(new PlayListClass("Zingaat", "Dhadak"));
        PlayListClass.add(new PlayListClass("Buzz", "Buzz"));

        Playlist_Adapter itemsAdapter = new Playlist_Adapter (this, PlayListClass);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
