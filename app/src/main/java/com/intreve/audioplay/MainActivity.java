package com.intreve.audioplay;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button playBtn, pauseBtn , stopBtn;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playBtn=findViewById(R.id.playBtn);
        pauseBtn=findViewById(R.id.pauseBtn);
        stopBtn=findViewById(R.id.stopBtn);


        mediaPlayer=MediaPlayer.create(this, R.raw.stay);

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mediaPlayer.isPlaying()){
                    mediaPlayer.start();
                }
            }
        });


        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                }
            }
        });

        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               mediaPlayer.stop();
               mediaPlayer= MediaPlayer.create(MainActivity.this, R.raw.stay);
            }
        });


    }
}