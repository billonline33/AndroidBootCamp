package com.example.bhuang.mvp.servicehistorydetails;

import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.bhuang.mvp.R;
import com.example.bhuang.mvp.data.IServiceHistoryRepository;
import com.example.bhuang.mvp.data.InMemoryServiceHistoryReposity;
import com.example.bhuang.mvp.models.ServiceHistory;

import org.w3c.dom.Text;

public class ServiceHistoryDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_history_details);
        String jobNumber=getIntent().getStringExtra("JobNumber");
        int iD=getIntent().getIntExtra("ID",0);


        IServiceHistoryRepository serviseHistoryRepository = new InMemoryServiceHistoryReposity();

        ServiceHistory serviceHistory= serviseHistoryRepository.getServiceHistory(iD);

        initUI(serviceHistory);
    }

    private void initUI(ServiceHistory serviceHistory) {
        TextView tID=(TextView)findViewById(R.id.tvServiceHistoryId);
        TextView tMechanicName=(TextView)findViewById(R.id.tvMechanicName);
        TextView tJobNumber=(TextView)findViewById(R.id.tvJobNumber);
        TextView tServiceDate=(TextView)findViewById(R.id.tvServiceDate);

        tID.setText(String.valueOf(serviceHistory.getId()));
        tMechanicName.setText(serviceHistory.getMechanicName());
        tJobNumber.setText(serviceHistory.getJobNumber());
        java.text.SimpleDateFormat df=new java.text.SimpleDateFormat("dd/MM/yyyy");
        tServiceDate.setText(df.format(serviceHistory.getServiceDate()));




    }

}
