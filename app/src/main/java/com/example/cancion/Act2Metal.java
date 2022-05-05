package com.example.cancion;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

public class Act2Metal extends AppCompatActivity {

    ImageView imgPlay11,imgPlay12,imgPlay13,imgPlay14,imgPlay15;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2_metal);

        imgPlay11 = findViewById(R.id.imgPlay11);
        imgPlay12 = findViewById(R.id.imgPlay12);
        imgPlay13 = findViewById(R.id.imgPlay13);
        imgPlay14 = findViewById(R.id.imgPlay14);
        imgPlay15 = findViewById(R.id.imgPlay15);

        imgPlay11.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Metal.this,R.raw.mmaximum);
            mp.start();
        });

        imgPlay12.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Metal.this,R.raw.msystem);
            mp.start();
        });
        imgPlay13.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Metal.this,R.raw.mpapa);
            mp.start();
        });
        imgPlay14.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Metal.this,R.raw.mrammstein);
            mp.start();
        });
        imgPlay15.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Metal.this,R.raw.mbabymetal);
            mp.start();
        });
    }
}