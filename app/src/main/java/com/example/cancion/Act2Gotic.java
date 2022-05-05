package com.example.cancion;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

public class Act2Gotic extends AppCompatActivity {

    ImageView imgPlay41, imgPlay42, imgPlay43, imgPlay44, imgPlay45;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2_gotic);

        imgPlay41 = findViewById(R.id.imgPlay41);
        imgPlay42 = findViewById(R.id.imgPlay42);
        imgPlay43 = findViewById(R.id.imgPlay43);
        imgPlay44 = findViewById(R.id.imgPlay44);
        imgPlay45 = findViewById(R.id.imgPlay45);

        imgPlay41.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Gotic.this,R.raw.gthecurelullaby);
            mp.start();
        });

        imgPlay42.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Gotic.this,R.raw.glacunacoildaylightdancer);
            mp.start();
        });
        imgPlay43.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Gotic.this,R.raw.gleaveseyes);
            mp.start();
        });
        imgPlay44.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Gotic.this,R.raw.gtreesofeternityblackocean);
            mp.start();
        });
        imgPlay45.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Gotic.this,R.raw.gfearwithintemptation);
            mp.start();
        });
    }
}