package com.example.cancion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Activity2 extends AppCompatActivity {

    ImageView imgv11, imgv12, imgv13, imgv14, imgv15;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        imgv11 = findViewById(R.id.imgv11);
        imgv12 = findViewById(R.id.imgv12);
        imgv13 = findViewById(R.id.imgv13);
        imgv14 = findViewById(R.id.imgv14);
        imgv15 = findViewById(R.id.imgv15);

        imgv11.setOnClickListener(view -> LlamarAudio11());
        imgv12.setOnClickListener(view -> LlamarAudio12());
        imgv13.setOnClickListener(view -> LlamarAudio13());
        imgv14.setOnClickListener(view -> LlamarAudio14());
        imgv15.setOnClickListener(view -> LlamarAudio15());
    }

    private void LlamarAudio11()
    {
        Intent intent = new Intent(Activity2.this,Act2JPop.class);
        startActivity(intent);
    }
    private void LlamarAudio12()
    {
        Intent intent = new Intent(Activity2.this,Act2Metal.class);
        startActivity(intent);
    }
    private void LlamarAudio13()
    {
        Intent intent = new Intent(Activity2.this,Act2Instrumental.class);
        startActivity(intent);
    }
    private void LlamarAudio14()
    {
        Intent intent = new Intent(Activity2.this,Act2Electro.class);
        startActivity(intent);
    }
    private void LlamarAudio15()
    {
        Intent intent = new Intent(Activity2.this,Act2Gotic.class);
        startActivity(intent);
    }
}