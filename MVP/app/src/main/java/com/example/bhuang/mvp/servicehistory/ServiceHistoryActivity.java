package com.example.bhuang.mvp.servicehistory;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.bhuang.mvp.R;
import com.example.bhuang.mvp.data.IServiceHistoryRepository;
import com.example.bhuang.mvp.data.InMemoryServiceHistoryReposity;
import com.example.bhuang.mvp.models.ServiceHistory;
import com.example.bhuang.mvp.models.ServiceHistoryDetails;
import com.example.bhuang.mvp.servicehistorydetails.ServiceHistoryDetailsActivity;

import java.util.ArrayList;
import java.util.List;

public class ServiceHistoryActivity extends AppCompatActivity implements ServiceHistoryContract.View {


    //MVP start
    private ServiceHistoryContract.UserActionListener mActionListener;

    //MVP end


    private ListView mListView;
    ServiceHistoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_history);

        IServiceHistoryRepository serviceHistoryRepository =new InMemoryServiceHistoryReposity();
        mActionListener=new ServiceHistoryPresenter(serviceHistoryRepository,this);


        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /*
                String jobNumber=(String)adapter.getItem(position).getJobNumber();
                int iD=(int) adapter.getItem(position).getId();
                ServiceHistory serviceHistory=(ServiceHistory)adapter.getItem(position);

                List<ServiceHistoryDetails> serviceHistoryDetails = new ArrayList<ServiceHistoryDetails>();

                Intent intent=new Intent(ServiceHistoryActivity.this, ServiceHistoryDetailsActivity.class);
                intent.putExtra("JobNumber",jobNumber);
                intent.putExtra("ID",iD);
                startActivityForResult(intent,11);
                */
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        mActionListener.loadServiceHistories();
    }



    //MVP function
    @Override
    public void ShowServiceHistories(List<ServiceHistory> serviceHistories) {
        ServiceHistoryAdapter adapter;
        adapter=new ServiceHistoryAdapter(this, R.layout.service_history_item_row,serviceHistories);

        mListView=(ListView) findViewById(R.id.lstvwrServiceHistory);
        mListView.setAdapter(adapter);
    }

    @Override
    public void ShowServiceHistoryDetails() {

    }
}
