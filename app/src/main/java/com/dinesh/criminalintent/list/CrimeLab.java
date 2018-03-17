package com.dinesh.criminalintent.list;

import android.content.Context;

import com.dinesh.criminalintent.domain.Crime;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by dines on 3/15/2018.
 */

public class CrimeLab {
    private static CrimeLab mCrimeLab;
    private List<Crime> mCrimes;
    public static CrimeLab get(Context context){
        if(mCrimeLab==null){
            mCrimeLab = new CrimeLab(context);
        }
        return mCrimeLab;
    }

    private CrimeLab(Context context){
        mCrimes = new ArrayList<>();
        for( int i=0;i<100; i++){
            Crime crime = new Crime();
            crime.setTitle("Crime #: " + i);
            crime.setSolved(i%2 ==0);
            mCrimes.add(crime);
        }
    }

    public List<Crime> getCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID id){
        for(Crime crime: mCrimes){
            if(crime.getId().equals(id)){
                return crime;
            }
        }
        return null;
    }

}
