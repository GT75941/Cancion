package com.example.cancion;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.widget.ImageView;
import android.widget.TextView;

public class Act2JPop extends AppCompatActivity {

    ImageView imgPlay1,imgPlay2,imgPlay3,imgPlay4,imgPlay5;
    TextView txv5,txv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2_jpop);

        imgPlay1 = findViewById(R.id.imgPlay1);
        imgPlay2 = findViewById(R.id.imgPlay2);
        imgPlay3 = findViewById(R.id.imgPlay3);
        imgPlay4 = findViewById(R.id.imgPlay4);
        imgPlay5 = findViewById(R.id.imgPlay5);

        txv5 =(TextView) findViewById(R.id.txv5);
        txv5.setMovementMethod(LinkMovementMethod.getInstance());
        txv4 =(TextView) findViewById(R.id.txv4);
        Linkify.addLinks(txv4,Linkify.WEB_URLS);
        txv4.setMovementMethod(LinkMovementMethod.getInstance());

        imgPlay1.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2JPop.this,R.raw.jsword);
            mp.start();
        });

        imgPlay2.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2JPop.this,R.raw.jnaruto);
            mp.start();
        });
        imgPlay3.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2JPop.this,R.raw.jevangelion);
            mp.start();
        });
        imgPlay4.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2JPop.this,R.raw.jfullmetal);
            mp.start();
        });
        imgPlay5.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(Act2JPop.this,R.raw.jmirai);
            mp.start();
        });
    }
}