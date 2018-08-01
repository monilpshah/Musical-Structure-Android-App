package com.example.pc.mtmusicplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView playerCardView;
    CardView playlistsCardView;
    CardView albumsCardView;
    CardView settingsCardView;
    MediaPlayer mediaPlayer;
    int pausecurrentposition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerCardView = (CardView) findViewById(R.id.menuPlayer);
        playlistsCardView = (CardView) findViewById(R.id.menuPlaylists);
        albumsCardView = (CardView) findViewById(R.id.menuAlbums);
        settingsCardView = (CardView) findViewById(R.id.menuSettings);

        playerCardView.setOnClickListener(playerTextViewOnClickListener);
        playlistsCardView.setOnClickListener(playlistsTextViewOnClickListener);
        albumsCardView.setOnClickListener(albumsTextViewOnClickListener);
        settingsCardView.setOnClickListener(settingsTextViewOnClickListener);

        Button play = (Button) findViewById(R.id.btn_play);
        Button pause = (Button) findViewById(R.id.btn_stop);
        Button stop = (Button) findViewById(R.id.btn_pause);


        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);

    }
    final View.OnClickListener playlistsTextViewOnClickListener = new View.OnClickListener(){
        public void onClick(final View v){
            openPlaylistsList(playlistsCardView);
        }
    };

    final View.OnClickListener playerTextViewOnClickListener = new View.OnClickListener(){
        public void onClick(final View v){
            openPlayer(playerCardView);
        }
    };

    final View.OnClickListener albumsTextViewOnClickListener = new View.OnClickListener(){
        public void onClick(final View v){
            openAlbumsList(albumsCardView);
        }
    };

    final View.OnClickListener settingsTextViewOnClickListener = new View.OnClickListener(){
        public void onClick(final View v){
            openSettingsList(settingsCardView);
        }
    };

    public void openAlbumsList(View view) {
        Intent intent = new Intent(this, Album.class);
        startActivity(intent);
    }

    public void openPlayer(View view) {
        Intent intent = new Intent(this, Player.class);
        startActivity(intent);
    }

    public void openPlaylistsList(View view) {
        Intent intent = new Intent(this, Playlist.class);
        startActivity(intent);
    }

    public void openSettingsList(View view) {
        Intent intent = new Intent(this, Setting.class);
        startActivity(intent);
    }



    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btn_play:
                if (mediaPlayer == null) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.music);
                    mediaPlayer.start();


                    int mCurrentPosition = mediaPlayer.getCurrentPosition() / 1000;


                } else if (!mediaPlayer.isPlaying()) {
                    mediaPlayer.start();
                }

                break;


            case R.id.btn_pause:
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                    pausecurrentposition = mediaPlayer.getCurrentPosition();
                }
                break;


            case R.id.btn_stop:
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    mediaPlayer = null;

                }
                break;
        }
    }
}
