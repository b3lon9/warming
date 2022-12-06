package com.b3lon9.warming.manager;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.b3lon9.warming.MainActivity;
import com.b3lon9.warming.fragment.MainFragment;
import com.b3lon9.warming.util.Constant;

public class FragmentManager {
    private Context mContext;
    private Fragment fragment;
    private FragmentTransaction fragmentTransaction;

    public FragmentManager(Context context) {
        this.mContext = context;
        this.fragmentTransaction = ((MainActivity)mContext).getSupportFragmentManager().beginTransaction();
    }

    public void replace(int id, int fragment_number) {
        fragment = create(fragment_number);
        fragmentTransaction.replace(id, fragment).commit();
    }

    private Fragment create(int fragment_number) {
        Fragment replaceFragment = null;

        switch(fragment_number) {
            case Constant.FRAGMENT_MAIN:
                replaceFragment = new MainFragment();
                break;
            case Constant.FRAGMENT_SUB:
        }
        return replaceFragment;
    }
}
