package com.example.timetableofclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    Button button10, button4, button5, button6, button7, button8, button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

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
                    Intent intent = new Intent(MainActivity5.this, MainActivity3.class);
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
                    Intent intent = new Intent(MainActivity5.this, oMonday2.class);
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
                    Intent intent = new Intent(MainActivity5.this, oTuesday2.class);
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
                    Intent intent = new Intent(MainActivity5.this, oWednesday2.class);
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
                    Intent intent = new Intent(MainActivity5.this, oThursday2.class);
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
                    Intent intent = new Intent(MainActivity5.this, oFriday2.class);
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
                    Intent intent = new Intent(MainActivity5.this, oSaturday2.class);
                    startActivity(intent);
                    finish();
                }
            }, 0);
        });


    }
}