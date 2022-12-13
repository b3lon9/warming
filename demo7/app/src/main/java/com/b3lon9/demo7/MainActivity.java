package com.b3lon9.demo7;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // TextView textView1 = (TextView)findViewById(R.id.txt01);    // casting하지 않아도 자동으로 입력
    TextView textView1;
    TextView textView2;
    TextView textView3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.txt01);
        textView1 = findViewById(R.id.txt02);
        textView1 = findViewById(R.id.txt03);
    }
}