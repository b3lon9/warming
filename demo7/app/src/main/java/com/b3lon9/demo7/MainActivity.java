package com.b3lon9.demo7;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    // TextView textView1 = (TextView)findViewById(R.id.txt01);    // casting하지 않아도 자동으로 입력
    TextView textView1;
    TextView textView2;
    TextView textView3;

    int index = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.txt01);
        textView2 = findViewById(R.id.txt02);
        textView3 = findViewById(R.id.txt03);
    }

    public void onBtnClicked(View view) {
        changeView();   // call method
    }

    private void changeView() {
        // 버튼 클릭시 실제 뷰와 뷰를 전환해주는 역할을 할 것
        if (index == 0) {
            textView1.setVisibility(View.VISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            index = 1;
        } else if (index == 1){
            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.VISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            index = 2;
        } else {
            System.out.println("long time no see~!");
            textView1.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.VISIBLE);
            index = 0;
        }
    }
}