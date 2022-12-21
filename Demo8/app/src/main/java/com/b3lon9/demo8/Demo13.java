package com.b3lon9.demo8;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Demo13 extends Activity {
    ArrayList<String> arrayList = null;
    ArrayAdapter<String> adapter = null;
    ListView listView = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo13);

        arrayList = new ArrayList<>();
        arrayList.add("홍길동");
        arrayList.add("김말똥");
        arrayList.add("강길동");
        arrayList.add("홍길북");
        arrayList.add("홍길동");
        arrayList.add("홍길서");
        arrayList.add("홍길남");
        arrayList.add("이길북");
        arrayList.add("고길북");
        arrayList.add("남길북");
        arrayList.add("남길북");
        arrayList.add("토레스");
        arrayList.add("레반도프스키");
        arrayList.add("클로제");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}

/**
 *  Data <-> Adapter <-> View
 * */