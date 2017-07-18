package com.example.bhuang.mvp.servicehistory;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
    private ServiceHistoryAdapter adapter;
    private RecyclerView mRecycleView;
    private ServiceHistoryRecycleViewAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private IServiceHistoryRepository serviceHistoryRepository;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_history);

        //set RecycleView
        mRecycleView=(RecyclerView)findViewById(R.id.recyclevwrServiceHistory);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager=new GridLayoutManager(this,2);
        mRecycleView.setLayoutManager(mLayoutManager);

        /* MVP function
        * Todo: need to inject Repository here instead of create a new instance
        * */
        serviceHistoryRepository =new InMemoryServiceHistoryReposity();
        mActionListener=new ServiceHistoryPresenter(serviceHistoryRepository,this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mActionListener.loadServiceHistories();
    }

    //MVP function
    @Override
    public void ShowServiceHistories(List<ServiceHistory> serviceHistories) {
        mAdapter=new ServiceHistoryRecycleViewAdapter(serviceHistoryRepository.getServiceHistories(), new ServiceHistoryRecycleViewAdapter.MyOnItemClickListener() {
            @Override
            public void onItemClick(ServiceHistory item) {
                mActionListener.openServiceHistoryDetails(item);
            }
        });
        mRecycleView.setAdapter(mAdapter);
    }

    @Override
    public void ShowServiceHistoryDetailsUI(int serviceHistoryId) {
        Intent intent=new Intent(this, ServiceHistoryDetailsActivity.class);
        intent.putExtra("serviceHistoryId",serviceHistoryId);
        startActivity(intent);
    }
}
