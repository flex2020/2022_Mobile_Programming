package com.a201812079.mobileprogramming2022;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3;
    EditText editText;
    private final static int REQEUST_CODE_MENU = 101;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("data", "홍길동이 쇠도끼를 훔쳐간 범인이다.");

                SimpleData simpleData = new SimpleData("홍길동", 20, "안녕, 난 홍길동이야.");
                intent.putExtra("simpleData", simpleData);


                //startActivity(intent);
                startActivityForResult(intent, REQEUST_CODE_MENU);
            }
        });
        button2 = (Button) findViewById(R.id.button2);
        editText = (EditText) findViewById(R.id.editTextTextPersonName);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = editText.getText().toString();

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data));
                startActivity(intent);
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                ComponentName componentName = new ComponentName("com.nhn.android.search", "com.nhn.android.search.MainActivity");
                intent.setComponent(componentName);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQEUST_CODE_MENU) {
            Toast.makeText(this, "onActivityResult 메소드 호출됨 : " + requestCode, Toast.LENGTH_SHORT).show();
            if(resultCode == RESULT_OK) {
                String name = data.getStringExtra("name");
                Toast.makeText(this, "전달된 name: " + name, Toast.LENGTH_SHORT).show();
            }
        }
    }
}