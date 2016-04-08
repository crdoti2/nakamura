package com.example.r_n_009.test_animation_4;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import android.animation.Animator.AnimatorPauseListener;

public class Animation01 extends Activity {
    private ToggleButton btn = null;
    private AnimatorSet mSet = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = (ImageView) findViewById(R.id.imageView);
        mSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.repeat);

        mSet.setTarget(img);
        mSet.start();
    }
    public void onPause(){
        super.onPause();
        btn = (ToggleButton)findViewById(R.id.tb);
        btn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mSet.pause();
                } else {
                    mSet.resume();
                }
            }
        });
    }
    public void onResume(){
        super.onResume();
        btn = (ToggleButton)findViewById(R.id.tb);
        btn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mSet.pause();
                } else {
                    mSet.resume();
                }
            }
        });
    }
}