package com.example.tutorial04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import static java.lang.Thread.sleep;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread(new Runnable() {
            public Object splash_screen;

            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent i= new Intent(splash_screen.this,MainActivity.class);
                    startActivity(i);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        });
    }
}