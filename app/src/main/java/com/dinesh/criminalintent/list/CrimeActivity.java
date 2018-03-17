package com.dinesh.criminalintent.list;

import android.support.v4.app.Fragment;

import com.dinesh.criminalintent.FragmentCrime;

public class CrimeActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new FragmentCrime();
    }


}
