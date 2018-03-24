package com.dinesh.criminalintent.list;

import android.support.v4.app.Fragment;

/**
 * Created by dines on 3/16/2018.
 */

public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
