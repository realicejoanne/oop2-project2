package com.shofi.uascihuy;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class YouarenotaloneAdapter extends RecyclerView.Adapter<YouarenotaloneAdapter.YouarenotaloneViewHolder> {

    ArrayList<Youarenotalone> ynaList;

    public YouarenotaloneAdapter(ArrayList<Youarenotalone> ynaList) {
        this.ynaList = ynaList;
    }

    @Override
    public YouarenotaloneViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.youarenotalone_item, parent, false);

        return new YouarenotaloneViewHolder(view);
    }

    @Override
    public void onBindViewHolder(YouarenotaloneViewHolder holder, int position) {
        Youarenotalone youarenotalone = ynaList.get(position);
        holder.nama.setText(youarenotalone.getNama());
        holder.lokasi.setText(youarenotalone.getLokasi());
        holder.telepon.setText(youarenotalone.getTelepon());
        holder.website.setText(youarenotalone.getWebsite());

    }

    @Override
    public int getItemCount() {
        return ynaList.size();
    }

    public class YouarenotaloneViewHolder extends RecyclerView.ViewHolder {

        TextView nama, lokasi, telepon, website;

        public YouarenotaloneViewHolder(View view) {
            super(view);

            nama = (TextView) view.findViewById(R.id.nama);
            lokasi =  (TextView) view.findViewById(R.id.lokasi);
            telepon = (TextView) view.findViewById(R.id.telepon);
            website =  (TextView) view.findViewById(R.id.website);
        }
    }
}

