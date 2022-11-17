package com.example.timetableofclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;

public class oTuesday1 extends AppCompatActivity {

    Button button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otuesday1);

        button10 = findViewById(R.id.button10);

        button10.setOnClickListener(view -> {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(oTuesday1.this, MainActivity4.class);
                    startActivity(intent);
                    finish();
                }
            }, 0);
        });

    }
}