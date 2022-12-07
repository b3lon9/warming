package com.b3lon9.warming.manager;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.b3lon9.warming.MainActivity;
import com.b3lon9.warming.fragment.MainFragment;
import com.b3lon9.warming.fragment.SubFragment;
import com.b3lon9.warming.util.Constant;

public class FragmentManager {
    private Context mContext;
    private FragmentTransaction fragmentTransaction;
    private int container;

    public FragmentManager(Context context, int container) {
        this.mContext = context;
        this.container = container;
        // this.fragmentTransaction =
    }

    public void replace(int fragment_number) {
        Fragment fragment = create(fragment_number);
        FragmentTransaction fragmentTransaction = ((MainActivity)mContext).getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(container, fragment).commit();
    }

    private Fragment create(int fragment_number) {
        Fragment replaceFragment = null;

        switch(fragment_number) {
            case Constant.FRAGMENT_MAIN:
                replaceFragment = new MainFragment();
                break;
            case Constant.FRAGMENT_SUB:
                replaceFragment = new SubFragment();
                break;
        }
        return replaceFragment;
    }
}
