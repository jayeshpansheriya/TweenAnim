package com.example.jayeshp.tweenanim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
Spinner s1;
    ImageView iv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1=(Spinner)findViewById(R.id.spinner);
        iv1=(ImageView)findViewById(R.id.imageView);

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                {
                    Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha);
                    iv1.startAnimation(animation);
                }else if (position==1)
                {

                    Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                    iv1.startAnimation(animation);
                }else if (position==2)
                {

                    Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale);
                    iv1.startAnimation(animation);
                }else {

                    Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate);
                    iv1.startAnimation(animation);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
