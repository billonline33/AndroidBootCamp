package com.example.bhuang.mvp.servicehistorydetails;

import com.example.bhuang.mvp.R;
import com.example.bhuang.mvp.models.ServiceHistoryDetails;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by bhuang on 7/18/2017.
 * reference: https://www.raywenderlich.com/126528/android-recyclerview-tutorial
 *            http://www.vogella.com/tutorials/AndroidRecyclerView/article.html
 */


public class ServiceHistoryDetailsAdapter extends RecyclerView.Adapter<ServiceHistoryDetailsAdapter.myViewHolder> {

    private List<ServiceHistoryDetails> lstServiceHistoryDetailses;

    public ServiceHistoryDetailsAdapter(List<ServiceHistoryDetails> lstServiceHistoryDetailses) {
        this.lstServiceHistoryDetailses = lstServiceHistoryDetailses;
    }

    @Override
    public ServiceHistoryDetailsAdapter.myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView=LayoutInflater.from(parent.getContext()).inflate(R.layout.service_history_details_item_row,parent,false);
        return new myViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(ServiceHistoryDetailsAdapter.myViewHolder holder, int position) {
        ServiceHistoryDetails serviceHistoryDetails=lstServiceHistoryDetailses.get(position);
        holder.bindView(serviceHistoryDetails);
    }

    @Override
    public int getItemCount() {
        return lstServiceHistoryDetailses.size();
    }

    // create a static inner class for the adatper, we add here rather than in a seperate class
    // because its behaviour is tightly coupled with the adapter
    public static class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private TextView tvLineCode;
        private TextView tvLineDesctiption;
        private TextView tvLineQty;
        private TextView tvLineType;

        public myViewHolder(View itemView) {
            super(itemView);
            tvLineCode=(TextView) itemView.findViewById(R.id.tvLineCode);
            tvLineDesctiption= (TextView) itemView.findViewById(R.id.tvLineDescription);
            tvLineQty=(TextView) itemView.findViewById(R.id.tvLineQry);
            tvLineType=(TextView) itemView.findViewById(R.id.tvLineType);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Log.d("RecycleView","Clicked!");
        }

        public void bindView(ServiceHistoryDetails serviceHistoryDetails)
        {
            tvLineCode.setText(serviceHistoryDetails.getLineCode());
            tvLineDesctiption.setText(serviceHistoryDetails.getLineDescription());
            tvLineQty.setText(String.valueOf(serviceHistoryDetails.getLineQty()));
            tvLineType.setText(String.valueOf(serviceHistoryDetails.getLineType()));
        }

    }

}
