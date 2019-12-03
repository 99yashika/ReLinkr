package com.example.relinkr;

import android.os.Bundle;
import android.print.PrinterId;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;
    private TextView textView;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        imageView = findViewById(R.id.im_splash);
        textView = findViewById(R.id.tv_splash);
        Animation muanim = AnimationUtils.loadAnimation(this,R.)


    }
}
