package com.a201812079.mobileprogramming2022;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class ListFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_list, container, false);
        Button button, button2, button3;
        button = rootView.findViewById(R.id.button);
        button2 = rootView.findViewById(R.id.button2);
        button3 = rootView.findViewById(R.id.button3);
        EditText editText = rootView.findViewById(R.id.editText);
        MainActivity mainActivity = (MainActivity) getActivity();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mainActivity.onImageSelected(0, editText.getText().toString());
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.onImageSelected(1, editText.getText().toString());
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.onImageSelected(2, editText.getText().toString());
            }
        });
        return rootView;
    }
}