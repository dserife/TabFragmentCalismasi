package com.example.tabfragmentcalismasi.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tabfragmentcalismasi.R;

public class FragmentTakvim extends Fragment {

    View v;

    public FragmentTakvim() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.takvim_fragment,container,false);
        return v;
    }
}
