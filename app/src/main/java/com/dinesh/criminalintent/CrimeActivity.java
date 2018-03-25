package com.dinesh.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.dinesh.criminalintent.list.SingleFragmentActivity;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {
    public static final String EXTRA_CRIME_ID = "crime_id";

    public static Intent newIntent(Context packagecontext, UUID crimeId) {
        Intent intent = new Intent(packagecontext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }


}
