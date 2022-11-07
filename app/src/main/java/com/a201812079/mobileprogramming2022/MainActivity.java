package com.a201812079.mobileprogramming2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ListFragment listFragment;
    ViewFragment viewFragment;

    int[] images = {R.drawable.dream01, R.drawable.dream02, R.drawable.dream03};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        listFragment = (ListFragment) fragmentManager.findFragmentById(R.id.fragmentContainerView);
        viewFragment = (ViewFragment) fragmentManager.findFragmentById(R.id.fragmentContainerView2);
    }

    public void onImageSelected(int position, String text) {
        viewFragment.setImageandText(position, text);
    }
}