package com.a201812079.mobileprogramming2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    String data;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    @Override
    protected void onStart() {
        super.onStart();
        intent = getIntent();
        data = getIntent().getStringExtra("data");

        Bundle bundle = intent.getExtras();
        SimpleData simpleData = (SimpleData) bundle.getParcelable("simpleData");
        showToast("전달된 data: " + data + "\n전달된 SimpleData\nname-" + simpleData.name
        + " age: " + simpleData.age + " \ncomment: " + simpleData.comment);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent();
        intent.putExtra("name", "홍길동");
        setResult(RESULT_OK, intent);
    }

    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}