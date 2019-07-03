package com.example.tabfragmentcalismasi.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tabfragmentcalismasi.Model.Bulten;
import com.example.tabfragmentcalismasi.R;
import com.example.tabfragmentcalismasi.Adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentBulten extends Fragment {

    View v;

    private RecyclerView recyclerView;
    private List<Bulten> bulten;

    public FragmentBulten() {
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.bulten_fragment,container,false);

        bulten= new ArrayList<>();

        bulten.add(new Bulten("haber başlığı","haber açıklaması açıklama",R.drawable.ic_launcher_background));
        bulten.add(new Bulten("haber başlığı","haber açıklaması açıklama",R.drawable.ic_launcher_background));
        bulten.add(new Bulten("haber başlığı","haber açıklaması açıklama",R.drawable.ic_launcher_background));
        bulten.add(new Bulten("haber başlığı","haber açıklaması açıklama",R.drawable.ic_launcher_background));
        bulten.add(new Bulten("haber başlığı","haber açıklaması açıklama",R.drawable.ic_launcher_background));
        bulten.add(new Bulten("haber başlığı","haber açıklaması açıklama",R.drawable.ic_launcher_background));
        bulten.add(new Bulten("haber başlığı","haber açıklaması açıklama",R.drawable.ic_launcher_background));

        recyclerView= v.findViewById(R.id.recyclerView);
        RecyclerViewAdapter recyclerViewAdapter= new RecyclerViewAdapter(getContext(),bulten);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
                return v;
    }


}
