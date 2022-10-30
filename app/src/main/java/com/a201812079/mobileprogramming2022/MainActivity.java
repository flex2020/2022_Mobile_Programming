package com.a201812079.mobileprogramming2022;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view = (View) findViewById(R.id.layout);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();

                if(action == MotionEvent.ACTION_DOWN) {
                    view.setBackgroundColor(Color.RED);
                } else if(action == MotionEvent.ACTION_MOVE) {
                    view.setBackgroundColor(Color.BLUE);
                } else if (action == MotionEvent.ACTION_UP) {
                    view.setBackgroundColor(Color.WHITE);
                }


                return true;
            }
        });

    }


}