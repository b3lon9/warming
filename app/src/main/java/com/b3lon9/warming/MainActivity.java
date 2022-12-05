package com.b3lon9.warming;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.b3lon9.warming.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {
    MainFragment mainFragment;

    Button mainBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainFragment = new MainFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.remove(mainFragment);
        ft.replace(R.id.main_fragment, mainFragment);
        ft.commit();

        mainBtn = findViewById(R.id.main_button);
        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("[debug]", "Button Test, Long Time No See Android");


            }
        });
    }
}