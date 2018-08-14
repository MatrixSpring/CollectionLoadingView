package com.dawn.loadingview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView rotating_loading;
    TextView number_progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rotating_loading = findViewById(R.id.rotating_loading);
        number_progress = findViewById(R.id.number_progress);

        rotating_loading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ShowLoadingActivity.class);
                startActivity(intent);
            }
        });
        number_progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NumberProgressActivity.class);
                startActivity(intent);
            }
        });
    }
}
