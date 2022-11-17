package com.example.timetableofclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;

public class chislitel2 extends AppCompatActivity {

    Button button10, button4, button5, button6, button7, button8, button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chislitel2);

        button10 = findViewById(R.id.button10);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        button10.setOnClickListener(view -> {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(chislitel2.this, vibor2.class);
                    startActivity(intent);
                    finish();
                }
            }, 0);
        });

        button4.setOnClickListener(view -> {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(chislitel2.this, imondey1.class);
                    startActivity(intent);
                    finish();
                }
            }, 0);
        });

        button5.setOnClickListener(view -> {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(chislitel2.this, iTuesday1.class);
                    startActivity(intent);
                    finish();
                }
            }, 0);
        });

        button6.setOnClickListener(view -> {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(chislitel2.this, iWednesday1.class);
                    startActivity(intent);
                    finish();
                }
            }, 0);
        });

        button7.setOnClickListener(view -> {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(chislitel2.this, iThursday1.class);
                    startActivity(intent);
                    finish();
                }
            }, 0);
        });


        button8.setOnClickListener(view -> {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(chislitel2.this, iFriday1.class);
                    startActivity(intent);
                    finish();
                }
            }, 0);
        });

        button9.setOnClickListener(view -> {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(chislitel2.this, iSaturday1.class);
                    startActivity(intent);
                    finish();
                }
            }, 0);
        });

    }
}