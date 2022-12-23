package com.b3lon9.demo8;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

// distribute data : xml
public class Demo14 extends Activity {
    ArrayList<String> arrayList = null;
    ArrayAdapter<CharSequence> adapter = null;
    ListView listView = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo14);

        // createFromResource() 메서드를 이용해 리소스로 부터 adapter생성
        adapter = ArrayAdapter.createFromResource(this, R.array.contact, android.R.layout.simple_list_item_1);

    }
}
