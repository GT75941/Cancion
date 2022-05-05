
package com.example.cancion;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

public class Act2Instrumental extends AppCompatActivity {

    ImageView imgPlay31,imgPlay32,imgPlay33,imgPlay34,imgPlay35;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2_instrumental);
        imgPlay31 = findViewById(R.id.imgPlay31);
        imgPlay32 = findViewById(R.id.imgPlay32);
        imgPlay33 = findViewById(R.id.imgPlay33);
        imgPlay34 = findViewById(R.id.imgPlay34);
        imgPlay35 = findViewById(R.id.imgPlay35);

        imgPlay31.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Instrumental.this,R.raw.iandre);
            mp.start();
        });

        imgPlay32.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Instrumental.this,R.raw.imost);
            mp.start();
        });
        imgPlay33.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Instrumental.this,R.raw.itwo);
            mp.start();
        });
        imgPlay34.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Instrumental.this,R.raw.isword);
            mp.start();
        });
        imgPlay35.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2Instrumental.this,R.raw.ivogel);
            mp.start();
        });
    }
}