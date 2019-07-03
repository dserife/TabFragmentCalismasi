package com.example.tabfragmentcalismasi.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    //fragment sayısını ve başlıklarını tutan değişkenler..
    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> titleList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        //fragment item sayısını tutan metot

        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        //fragment sayısını tutan metot

        return titleList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        //fragment başlık sayısını tutan metot

        return titleList.get(position);
    }

    public void fragmentEkle(Fragment fragment,String title){
        //fragment ve başlık eklememiz için oluşturduğumuz metot

        fragmentList.add(fragment);
        titleList.add(title);
    }
}
