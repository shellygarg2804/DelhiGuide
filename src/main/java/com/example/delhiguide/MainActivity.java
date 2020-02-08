package com.example.delhiguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creating a view pager object
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager);

        //creating an object for framgmentadaptor class
        FragmentAdaptor pageadaptor = new FragmentAdaptor(this,getSupportFragmentManager());

        //setting up of adaptor with view page
        viewPager.setAdapter(pageadaptor);

        //creating a tab Layout object
       TabLayout tabLayout=(TabLayout)findViewById(R.id.tabs);
       //setting up tab layout with view pager
       tabLayout.setupWithViewPager(viewPager);

    }
}
