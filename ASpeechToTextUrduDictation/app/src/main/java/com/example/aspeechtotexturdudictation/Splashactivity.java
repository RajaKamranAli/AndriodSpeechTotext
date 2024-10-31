package com.example.aspeechtotexturdudictation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splashactivity extends AppCompatActivity {
Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splashactivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        },3000);
    }
}