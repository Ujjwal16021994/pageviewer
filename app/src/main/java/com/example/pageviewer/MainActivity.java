package com.example.pageviewer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tablayout;
    ViewPager viewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tablayout = findViewById(R.id.idtab);
        viewpager = findViewById(R.id.idviewpager);

        ManagerViewPagerAdapter adat = new ManagerViewPagerAdapter(getSupportFragmentManager());
        viewpager.setAdapter(adat);

        tablayout.setupWithViewPager(viewpager);
    }
}