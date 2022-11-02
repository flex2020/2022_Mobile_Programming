package com.a201812079.mobileprogramming2022;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText, editText2;

    private static final int REQ_ACT2_CODE = 101;


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

                startActivityForResult(intent, REQ_ACT2_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQ_ACT2_CODE) {
            //showToast("전달받은 requestCode: " + REQ_ACT2_CODE);
            if(resultCode == RESULT_OK) {
                String res = data.getStringExtra("data");
                showToast("전달받은 data: " + res );
            }
        }
    }

    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}