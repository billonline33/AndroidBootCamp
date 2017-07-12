package com.example.bhuang.mvp.servicehistory;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.bhuang.mvp.R;
import com.example.bhuang.mvp.data.IServiceHistoryRepository;
import com.example.bhuang.mvp.data.InMemoryServiceHistoryReposity;
import com.example.bhuang.mvp.models.ServiceHistory;

import java.util.List;

/**
 * Created by bhuang on 6/28/2017.
 */

public class ServiceHistoryAdapter extends ArrayAdapter<ServiceHistory> {

    private List<ServiceHistory> serviceHistories;

    public ServiceHistoryAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<ServiceHistory> serviceHistories) {
        super(context, resource, serviceHistories);
        this.serviceHistories=serviceHistories;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(R.layout.service_history_item_row,null);


        ServiceHistory serviceHistory=serviceHistories.get(position);

        TextView tvId = (TextView) convertView.findViewById(R.id.tvServiceHistoryId);
        tvId.setText(String.valueOf(serviceHistory.getId())=="null"?"":String.valueOf(serviceHistory.getId()));

        TextView tvJobNumber=(TextView) convertView.findViewById(R.id.tvJobNumber);
        tvJobNumber.setText(serviceHistory.getJobNumber()=="null"?"":serviceHistory.getJobNumber());

        return convertView;

    }


}
