package com.example.timetableofclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;

public class znamenatel2 extends AppCompatActivity {

    Button button10, button4, button5, button6, button7, button8, button9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_znamenatel2);

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
                    Intent intent = new Intent(znamenatel2.this, vibor2.class);
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
                    Intent intent = new Intent(znamenatel2.this, imondey2.class);
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
                    Intent intent = new Intent(znamenatel2.this, iTuesday2.class);
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
                    Intent intent = new Intent(znamenatel2.this, iWednesday2.class);
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
                    Intent intent = new Intent(znamenatel2.this, iThursday2.class);
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
                    Intent intent = new Intent(znamenatel2.this, iFriday2.class);
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
                    Intent intent = new Intent(znamenatel2.this, iSaturday2.class);
                    startActivity(intent);
                    finish();
                }
            }, 0);
        });


    }
}