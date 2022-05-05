package com.example.cancion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button activi1,activi2,activi3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activi1=findViewById(R.id.activi1);
        activi2=findViewById(R.id.activi2);
        activi3=findViewById(R.id.activi3);

        activi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.neko);
                mp.start();
                LlamarAudio();
            }
        });
        activi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.neko);
                mp.start();
                LlamarAudio2();
            }
        });
        activi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.neko);
                mp.start();
                LlamarAudio3();
            }
        });
    }
    private void LlamarAudio()
    {
        Intent intent = new Intent(MainActivity.this,Activity1.class);
        startActivity(intent);
    }
    private void LlamarAudio2()
    {
        Intent intent = new Intent(MainActivity.this,Activity2.class);
        startActivity(intent);
    }
    private void LlamarAudio3()
    {
        Intent intent = new Intent(MainActivity.this,Activity3.class);
        startActivity(intent);
    }
}