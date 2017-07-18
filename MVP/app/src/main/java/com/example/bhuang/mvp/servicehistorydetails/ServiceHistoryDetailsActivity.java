package com.example.bhuang.mvp.servicehistorydetails;

import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.bhuang.mvp.R;
import com.example.bhuang.mvp.data.IServiceHistoryRepository;
import com.example.bhuang.mvp.data.InMemoryServiceHistoryReposity;
import com.example.bhuang.mvp.models.ServiceHistory;
import com.example.bhuang.mvp.models.ServiceHistoryDetails;

import org.w3c.dom.Text;

import java.util.List;

public class ServiceHistoryDetailsActivity extends AppCompatActivity implements ServiceHistoryDetailsContract.View {
    private ServiceHistoryDetailsContract.UserActionListener mUserActionListener;
    private IServiceHistoryRepository serviceHistoryRepository;
    private int serviceHistoryId;
    private RecyclerView mRecycleView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_history_details);
        serviceHistoryId=getIntent().getIntExtra("serviceHistoryId",0);

        mRecycleView=(RecyclerView)findViewById(R.id.recycleViewServiceHistoryDetails);
        mRecycleView.setLayoutManager(new GridLayoutManager(this,2));

        /* MVP function
        * Todo: need to inject Repository here instead of create a new instance
        * */
        serviceHistoryRepository =new InMemoryServiceHistoryReposity();
        mUserActionListener= new ServiceHistoryDetailsPresenter(serviceHistoryRepository,this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        mUserActionListener.loadServiceHistoryDetails(serviceHistoryId);
    }

    private void initUI(ServiceHistory serviceHistory) {

    }

    @Override
    public void ShowServiceHistoryDetails(List<ServiceHistoryDetails> listServiceHistoryDetails) {
        //setup adapter here
        ServiceHistoryDetailsAdapter serviceHistoryDetailsAdapter=new ServiceHistoryDetailsAdapter(listServiceHistoryDetails);
        mRecycleView.setAdapter(serviceHistoryDetailsAdapter);
    }
}
