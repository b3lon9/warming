package com.b3lon9.demo8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_hscrollview);
        
        Custom custom = new Custom(this);
        setContentView(custom);     // custom 객체를 넣음
    }
}