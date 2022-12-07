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

        fragmentManager = new FragmentManager(this, R.id.main_fragment);
        fragmentManager.replace(Constant.FRAGMENT_MAIN);

        mainBtn = findViewById(R.id.main_button);
        mainBtn.setOnClickListener(clickListener);
    }

    private View.OnClickListener clickListener = view -> {
        Log.d("[debug]", "Button Test, Long Time No See Android");
        fragmentManager.replace(Constant.FRAGMENT_SUB);

    };
}