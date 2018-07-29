package com.example.pc.mtmusicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class Player extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer mediaPlayer;
    int pausecurrentposition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);


        Button play = (Button) findViewById(R.id.btn_play);
        Button pause = (Button) findViewById(R.id.btn_stop);
        Button stop = (Button) findViewById(R.id.btn_pause);


        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);


    }

    @Override
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
