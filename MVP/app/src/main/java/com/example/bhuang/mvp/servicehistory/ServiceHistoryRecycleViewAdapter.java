package com.example.bhuang.mvp.servicehistory;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.bhuang.mvp.R;

import com.example.bhuang.mvp.models.ServiceHistory;

import java.util.List;

/**
 * Created by bhuang on 7/12/2017.
 */

public class ServiceHistoryRecycleViewAdapter extends RecyclerView.Adapter<ServiceHistoryRecycleViewAdapter.ViewHolder> {

    private  List<ServiceHistory>  mServiceHistories;

    public ServiceHistoryRecycleViewAdapter(List<ServiceHistory> serviceHistories)
    {
        setList(serviceHistories);
    }

    private void setList(List<ServiceHistory> serviceHistories)
    {
        mServiceHistories=serviceHistories;

    }


    public class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView txtID;
        public TextView txtMechanicName;
        public TextView txtJobNumber;
        public TextView txtServiceDate;
        public TextView txtEquipmentNumber;
        public TextView txtHourMeter;
        public TextView txtJobCategoty;
        public TextView txtNote;


        public ViewHolder(View v)
        {
            super(v);
            txtID=(TextView) v.findViewById(R.id.tvServiceHistoryId);
            txtMechanicName=(TextView)v.findViewById(R.id.tvMechanicName);
            txtJobNumber=(TextView)v.findViewById(R.id.tvJobNumber);
            txtServiceDate=(TextView)v.findViewById(R.id.tvServiceDate);
            txtEquipmentNumber=(TextView)v.findViewById(R.id.tvEquipmentNumber);
            txtHourMeter=(TextView)v.findViewById(R.id.tvHourMeter);
            txtJobCategoty=(TextView)v.findViewById(R.id.tvJobCategory);
            txtNote=(TextView)v.findViewById(R.id.tvNote);

        }
    }

    @Override
    public int getItemCount() {
        return mServiceHistories.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View v=inflater.inflate(R.layout.service_history_item_row,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ServiceHistoryRecycleViewAdapter.ViewHolder holder, int position) {
        ServiceHistory serviceHistory=mServiceHistories.get(position);

        holder.txtID.setText(String.valueOf(serviceHistory.getId())=="null"?"":String.valueOf(serviceHistory.getId()));
        holder.txtMechanicName.setText(serviceHistory.getMechanicName()=="null"?"":serviceHistory.getMechanicName());
        holder.txtJobNumber.setText(serviceHistory.getJobNumber()=="null"?"":serviceHistory.getJobNumber());
        holder.txtEquipmentNumber.setText(serviceHistory.getEquipmentNumber()=="null"?"":serviceHistory.getEquipmentNumber());
        holder.txtHourMeter.setText(String.valueOf(serviceHistory.getHourMeter()));
        holder.txtJobCategoty.setText(serviceHistory.getJobCategory()=="null"?"":serviceHistory.getJobCategory());
        holder.txtNote.setText(serviceHistory.getNote()=="null"?"":serviceHistory.getNote());
    }

}
