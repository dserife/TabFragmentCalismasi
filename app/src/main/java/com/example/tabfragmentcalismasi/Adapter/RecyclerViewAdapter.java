package com.example.tabfragmentcalismasi.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tabfragmentcalismasi.Model.Bulten;
import com.example.tabfragmentcalismasi.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    Context context;
    List<Bulten> bultenList;

    public RecyclerViewAdapter(Context context, List<Bulten> bultenList) {
        this.context = context;
        this.bultenList = bultenList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v= LayoutInflater.from(context).inflate(R.layout.item_bulten_rv,viewGroup,false);
        MyViewHolder myViewHolder= new MyViewHolder(v);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.tvBaslik.setText(bultenList.get(i).getBultenBaslik());
        myViewHolder.tvAciklama.setText(bultenList.get(i).getBultenAciklama());
        myViewHolder.ivResim.setImageResource(bultenList.get(i).getBultenResim());
    }

    @Override
    public int getItemCount() {
        return bultenList.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tvBaslik;
        private TextView tvAciklama;
        private ImageView ivResim;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvBaslik=itemView.findViewById(R.id.tvBaslik);
            tvAciklama=itemView.findViewById(R.id.tvAciklama);
            ivResim=itemView.findViewById(R.id.ivResim);


        }
    }
}
