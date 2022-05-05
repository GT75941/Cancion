package com.example.cancion;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

public class Activity1 extends AppCompatActivity {
    ImageView imgv1, imgv2, imgv3, imgv4, imgv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        imgv1 = findViewById(R.id.imgv1);
        imgv2 = findViewById(R.id.imgv2);
        imgv3 = findViewById(R.id.imgv3);
        imgv4 = findViewById(R.id.imgv4);
        imgv5 = findViewById(R.id.imgv5);

        imgv1.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Activity1.this,R.raw.jpop);
            mp.start();
        });

        imgv2.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Activity1.this,R.raw.metal);
            mp.start();
        });
        imgv3.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Activity1.this,R.raw.electronica);
            mp.start();
        });
        imgv4.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Activity1.this,R.raw.instrumental);
            mp.start();
        });
        imgv5.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Activity1.this,R.raw.gotico);
            mp.start();
        });
    }
}