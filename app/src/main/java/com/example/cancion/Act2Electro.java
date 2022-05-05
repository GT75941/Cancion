package com.example.cancion;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

public class Act2Electro extends AppCompatActivity {

    ImageView imgPlay21,imgPlay22,imgPlay23,imgPlay24,imgPlay25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2_electro);

        imgPlay21 = findViewById(R.id.imgPlay21);
        imgPlay22 = findViewById(R.id.imgPlay22);
        imgPlay23 = findViewById(R.id.imgPlay23);
        imgPlay24 = findViewById(R.id.imgPlay14);
        imgPlay25 = findViewById(R.id.imgPlay15);

        imgPlay21.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Electro.this,R.raw.ealesso);
            mp.start();
        });

        imgPlay22.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Electro.this,R.raw.eartic);
            mp.start();
        });
        imgPlay23.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Electro.this,R.raw.egalantis);
            mp.start();
        });
        imgPlay24.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Electro.this,R.raw.eminelli);
            mp.start();
        });
        imgPlay25.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Electro.this,R.raw.epostmalone);
            mp.start();
        });
    }


}