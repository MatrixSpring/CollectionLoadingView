package com.dawn.loadingview;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.Toast;

import com.dawn.loadingview.view.NumberProgressBar;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by dawn on 2018/8/13.
 */

public class NumberProgressActivity extends AppCompatActivity {
    private NumberProgressBar bnp;
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_progress);
        bnp = findViewById(R.id.numberbar1);

        bnp.setOnProgressBarListener(new NumberProgressBar.OnProgressBarListener() {
            @Override
            public void onProgressChange(int current, int max) {
                bnp.setProgress(0);
            }
        });
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Log.d("runOnUiThread","runOnUiThread : runOnUiThread");
                        bnp.incrementProgressBy(1);
                    }
                });
            }
        }, 1000, 100);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        timer.cancel();
    }

}