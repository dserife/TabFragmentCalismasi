package com.example.tabfragmentcalismasi.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tabfragmentcalismasi.R;

public class FragmentSuicme extends Fragment {

    View v;

    public FragmentSuicme() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.suicme_fragment,container,false);
        return v;
    }
}
