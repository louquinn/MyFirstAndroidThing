package com.example.lquinn.myfirstandroidthing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class W2A extends Activity
{
    AnimationDrawable androidAnimation;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ImageView androidImage = (ImageView) findViewById(R.id.android);
        androidImage.setBackgroundResource(R.drawable.android_animate);
        androidAnimation = (AnimationDrawable) androidImage.getBackground();
        final Button btnAnimate = (Button) findViewById(R.id.animate);
        View.OnClickListener ocl;
        ocl = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                androidAnimation.stop();
                androidAnimation.start();
            }
        };
        btnAnimate.setOnClickListener(ocl);
    }
}