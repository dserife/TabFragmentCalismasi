package com.example.tabfragmentcalismasi.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tabfragmentcalismasi.Fragment.FragmentBulten;
import com.example.tabfragmentcalismasi.Fragment.FragmentSuicme;
import com.example.tabfragmentcalismasi.Fragment.FragmentTakvim;
import com.example.tabfragmentcalismasi.R;
import com.example.tabfragmentcalismasi.Adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.viewPager);
        viewPagerAdapter= new ViewPagerAdapter(getSupportFragmentManager());

        //fragment eklenmesi
        viewPagerAdapter.fragmentEkle(new FragmentBulten(),"BÜLTEN");
        viewPagerAdapter.fragmentEkle(new FragmentSuicme(),"SU İÇTİN Mİ?");
        viewPagerAdapter.fragmentEkle(new FragmentTakvim(),"TAKVİM");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
