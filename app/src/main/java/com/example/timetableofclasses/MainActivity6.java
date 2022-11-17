package com.example.timetableofclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    Button button11, button12, button13, button14, button15, button16, button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button10 = findViewById(R.id.button10);

        button11.setOnClickListener(view -> {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity6.this, MainActivity3.class);
                    startActivity(intent);
                    finish();
                }
            }, 0);
        });

        button12.setOnClickListener(view -> {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity6.this, MainActivity3.class);
                    startActivity(intent);
                    finish();
                }
            }, 0);
        });

        button13.setOnClickListener(view -> {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity6.this, MainActivity3.class);
                    startActivity(intent);
                    finish();
                }
            }, 0);
        });

        button14.setOnClickListener(view -> {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity6.this, vibor2.class);
                    startActivity(intent);
                    finish();
                }
            }, 0);
        });

        button15.setOnClickListener(view -> {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity6.this, MainActivity3.class);
                    startActivity(intent);
                    finish();
                }
            }, 0);
        });

        button16.setOnClickListener(view -> {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity6.this, MainActivity3.class);
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
                    Intent intent = new Intent(MainActivity6.this, MainActivity2.class);
                    startActivity(intent);
                    finish();
                }
            }, 0);
        });

    }
}