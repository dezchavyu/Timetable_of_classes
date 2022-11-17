package com.example.timetableofclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button button2, button3, button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button10 = findViewById(R.id.button10);

        button2.setOnClickListener(view -> {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                    startActivity(intent);
                    finish();
                }
            }, 0);
        });

        button3.setOnClickListener(view -> {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity3.this, MainActivity5.class);
                    startActivity(intent);
                    finish();
                }
            }, 0);
        });

        button10.setOnClickListener(view -> {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity3.this, MainActivity6.class);
                    startActivity(intent);
                    finish();
                }
            }, 0);
        });

    }
}