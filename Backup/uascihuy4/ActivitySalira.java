package com.shofi.uascihuy;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class ActivitySalira extends AppCompatActivity {

    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salira);
        mViewPager = (ViewPager) findViewById(R.id.salirapager);
/** set the adapter for ViewPager */
        mViewPager.setAdapter(new SaliraPagerAdapter(
                getSupportFragmentManager()));
    }

}
