package com.example.delhiguide;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdaptor extends FragmentPagerAdapter {
    private Context mcontext;
    //constructor
    public FragmentAdaptor(Context context,FragmentManager fm) {
        super(fm);
        mcontext=context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            return new Monuments();
        }
        else if(position==1)
        {
            return new restaurants();
        }
        else if(position==2)
        {
            return new Landmark();
        }
        else{
            return new Hospitals();
        }
    }

    @Override
    //Returns number of pages
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override

    // A function which return the text to be present in tabs according to position
    public CharSequence getPageTitle(int position) {
        if(position==0)
        {
            return "Monuments";
        }
        else if(position==1)
        {
            return "restaurants";
        }
        else if(position==2)
        {
            return "Landmarks";
        }
        else{
            return "Hospitals";
        }
    }
}
