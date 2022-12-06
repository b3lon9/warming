package com.b3lon9.warming;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.b3lon9.warming.manager.FragmentManager;
import com.b3lon9.warming.util.Constant;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    Button mainBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mainFragment = new MainFragment();
//        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//        ft.remove(mainFragment);
//        ft.replace(R.id.main_fragment, mainFragment);
//
//        mainBtn = findViewById(R.id.main_button);ft.commit();
        fragmentManager = new FragmentManager(this);
        fragmentManager.replace(R.id.main_fragment, Constant.FRAGMENT_MAIN);

        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("[debug]", "Button Test, Long Time No See Android");

//                fragmentManager.replace(R.id.sub_fragment, Constant.FRAGMENT_SUB);
            }
        });
    }
}