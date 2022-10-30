package com.a201812079.mobileprogramming2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                int age = Integer.parseInt(editText2.getText().toString());

                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                SimpleData simpleData = new SimpleData(name, age);
                intent.putExtra("data", simpleData);

                startActivity(intent);
            }
        });
    }
}