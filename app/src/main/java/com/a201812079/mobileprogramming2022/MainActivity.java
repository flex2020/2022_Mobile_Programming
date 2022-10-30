/**
 * 2.
 *
 * 진수가 좋아하는 사진 2개가 있다. 진수는 핸드폰 사진앱에 저장해서 사진을 보기 싫어했다. 그 결과 앱에 사진을 저장하여 진수가 원할때 보고 싶은 사진을 출력해주는 앱을 만들려고 한다. 다음을 작성하시오.
 *
 * 1. 사진1과 사진2를 출력하는 이미지 뷰를 생성해서 작성하시오.
 * 2. 버튼1과 버튼2를 만들고 버튼1을 눌렀을때는 사진1, 버튼2를 눌렀을때는 사진2를 출력하시오.
 *
 * 조건
 *
 * 1. 반드시 스크롤뷰를 사용하여 화면을 벗어난 영역도 표시할 수 있게 만들어야합니다.
 * 2. 리니어 레이아웃 가로 방향으로 작성하시오.
 * 3. 버튼1과 버튼2의 색상은 달라야 한다.
 * 4. 이미지뷰는 반드시 1개만 사용해야한다.
 *
 *
 * */

package com.a201812079.mobileprogramming2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setBackgroundColor(Color.RED);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resources res = getResources();
                BitmapDrawable bitmap = (BitmapDrawable)
                        res.getDrawable(R.drawable.largeimg1);
                int bitmapWidth = bitmap.getIntrinsicWidth();
                int bitmapHeight = bitmap.getIntrinsicHeight();
                imageView.setImageDrawable(bitmap);
                imageView.getLayoutParams().width = bitmapWidth;
                imageView.getLayoutParams().height = bitmapHeight;
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resources res = getResources();
                BitmapDrawable bitmap = (BitmapDrawable)
                        res.getDrawable(R.drawable.largeimg2);
                int bitmapWidth = bitmap.getIntrinsicWidth();
                int bitmapHeight = bitmap.getIntrinsicHeight();
                imageView.setImageDrawable(bitmap);
                imageView.getLayoutParams().width = bitmapWidth;
                imageView.getLayoutParams().height = bitmapHeight;
            }
        });



    }
}