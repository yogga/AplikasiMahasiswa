package com.example.d2a.aplikasimahasiswa;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by D2A on 10/3/2017.
 */

public class MhsAdapter extends RecyclerView.Adapter<MhsAdapter.MhsHolder> {


    Context ctx;
    ArrayList<Mahasiswa> dataMhs;

    public MhsAdapter(Context ctx, ArrayList<Mahasiswa> dataMhs) {
        this.ctx = ctx;
        this.dataMhs = dataMhs;
    }

    @Override
    public MhsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View mhsView = inflater.inflate(R.layout.mhs_single,parent,false);

        return new MhsHolder(mhsView);
    }

    @Override
    public void onBindViewHolder(MhsHolder holder, int position) {

        holder.txt_nim.setText(dataMhs.get(position).getNim());
        holder.txt_nama.setText(dataMhs.get(position).getNama());
        holder.txt_ipk.setText(Double.toString(dataMhs.get(position).getIpk()));

    }

    @Override
    public int getItemCount() {
        return dataMhs.size();
    }

    public class MhsHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        TextView txt_nim,txt_nama,txt_ipk;

        public MhsHolder(View itemView) {
            super(itemView);
            txt_nim = (TextView) itemView.findViewById(R.id.txt_nim);
            txt_nama = (TextView) itemView.findViewById(R.id.txt_nama);
            txt_ipk = (TextView) itemView.findViewById(R.id.txt_ipk);

            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {

            Toast.makeText(itemView.getContext(),
                    txt_nama.getText()+ " - "+txt_ipk.getText(),
                    Toast.LENGTH_SHORT).show();
        }
    }
}
