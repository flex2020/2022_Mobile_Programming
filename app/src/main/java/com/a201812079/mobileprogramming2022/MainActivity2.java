package com.a201812079.mobileprogramming2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Intent intent;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = (TextView) findViewById(R.id.textView2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        intent = getIntent();
        Bundle bundle = intent.getExtras();
        SimpleData data = (SimpleData) bundle.getParcelable("data");
        String content = "이름 : " + data.name + ", 나이 : " + data.age + "세";
        tv.setText(content);
    }
}