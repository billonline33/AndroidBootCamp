package com.example.bhuang.mvp.servicehistory;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import com.example.bhuang.mvp.R;

import com.example.bhuang.mvp.models.ServiceHistory;

import java.util.List;

/**
 * Created by bhuang on 7/12/2017.
 */

public class ServiceHistoryRecycleViewAdapter extends RecyclerView.Adapter<ServiceHistoryRecycleViewAdapter.MyViewHolder> {

    private  List<ServiceHistory>  mServiceHistories;
    private  MyOnItemClickListener mListener;

    public interface MyOnItemClickListener{
        void onItemClick(ServiceHistory item);
    }

    public ServiceHistoryRecycleViewAdapter(List<ServiceHistory> serviceHistories, MyOnItemClickListener listener)
    {
        setList(serviceHistories);
        this.mListener =listener;
    }

    private void setList(List<ServiceHistory> serviceHistories)
    {
        mServiceHistories=serviceHistories;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        public TextView txtID;
        public TextView txtMechanicName;
        public TextView txtJobNumber;
        public TextView txtServiceDate;
        public TextView txtEquipmentNumber;
        public TextView txtHourMeter;
        public TextView txtJobCategoty;
        public TextView txtNote;


        public MyViewHolder(View v, MyOnItemClickListener listener)
        {
            super(v);
            mListener= listener;
            txtID=(TextView) v.findViewById(R.id.tvServiceHistoryId);
            txtMechanicName=(TextView)v.findViewById(R.id.tvMechanicName);
            txtJobNumber=(TextView)v.findViewById(R.id.tvJobNumber);
            txtServiceDate=(TextView)v.findViewById(R.id.tvServiceDate);
            txtEquipmentNumber=(TextView)v.findViewById(R.id.tvEquipmentNumber);
            txtHourMeter=(TextView)v.findViewById(R.id.tvHourMeter);
            txtJobCategoty=(TextView)v.findViewById(R.id.tvJobCategory);
            txtNote=(TextView)v.findViewById(R.id.tvNote);
            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position=getAdapterPosition();
            ServiceHistory mServiceHistory=getItem(position);
            mListener.onItemClick(mServiceHistory);
        }

        public ServiceHistory getItem(int position)
        {
            return mServiceHistories.get(position);
        }
    }

    @Override
    public int getItemCount() {
        return mServiceHistories.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View v=inflater.inflate(R.layout.service_history_item_row,parent,false);
        return new MyViewHolder(v,mListener);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
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
