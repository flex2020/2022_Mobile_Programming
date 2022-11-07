package com.a201812079.mobileprogramming2022;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewFragment extends Fragment {
    ImageView imageView;
    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_view, container, false);
        imageView = rootView.findViewById(R.id.imageView);
        textView = rootView.findViewById(R.id.textView);


        return rootView;
    }

    public void setImageandText(int i, String text) {
        MainActivity mainActivity = (MainActivity) getActivity();
        imageView.setImageResource(mainActivity.images[i]);
        textView.setText(text);
    }
}