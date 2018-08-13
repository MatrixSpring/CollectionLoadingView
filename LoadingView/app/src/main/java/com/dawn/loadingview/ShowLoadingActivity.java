package com.dawn.loadingview;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

/**
 * Created by dawn on 2018/8/13.
 */

public class ShowLoadingActivity extends AppCompatActivity {
    ImageView iv_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_loading);
        iv_image = findViewById(R.id.rotating_image);
    }

    @Override
    protected void onResume() {
        super.onResume();
        startShowLoading();
    }

    private void startShowLoading(){
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(iv_image, "rotation", 0f, 360f);//添加旋转动画，旋转中心默认为控件中点
        objectAnimator.setDuration(500);//设置动画时间
        objectAnimator.setInterpolator(new LinearInterpolator());//动画时间线性渐变
        objectAnimator.setRepeatCount(ObjectAnimator.INFINITE);
        objectAnimator.setRepeatMode(ObjectAnimator.RESTART);
        objectAnimator.start();//动画开始
    }
}