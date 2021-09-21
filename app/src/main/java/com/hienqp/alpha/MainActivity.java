package com.hienqp.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageViewAlpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewAlpha = (ImageView) findViewById(R.id.imageView_alpha);

        Animation animationAlpha = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_alpha);

        imageViewAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animationAlpha);
            }
        });
    }
}