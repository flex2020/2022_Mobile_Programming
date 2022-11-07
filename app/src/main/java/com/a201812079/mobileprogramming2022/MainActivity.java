package com.a201812079.mobileprogramming2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    FirstFragment firstFragment;
    SecondFragment secondFragment;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, firstFragment).commit();
    }

    public void onFragmentChange(int i) {
        if(i == 0) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, secondFragment).commit();
        } else {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, firstFragment).commit();
        }
    }
}