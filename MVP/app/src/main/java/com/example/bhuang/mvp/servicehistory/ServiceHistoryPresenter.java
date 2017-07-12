package com.example.bhuang.mvp.servicehistory;

import android.view.View;
import android.widget.ListView;

import com.example.bhuang.mvp.R;
import com.example.bhuang.mvp.data.IServiceHistoryRepository;
import com.example.bhuang.mvp.data.InMemoryServiceHistoryReposity;
import com.example.bhuang.mvp.models.ServiceHistory;

import java.util.List;

/**
 * Created by bhuang on 7/11/2017.
 */

public class ServiceHistoryPresenter implements ServiceHistoryContract.UserActionListener {

    private final IServiceHistoryRepository serviceHistoryRepository;  //=new InMemoryServiceHistoryReposity()
    private final ServiceHistoryContract.View mView;

    public ServiceHistoryPresenter(IServiceHistoryRepository serviceHistoryRepository, ServiceHistoryContract.View mView) {
        this.serviceHistoryRepository = serviceHistoryRepository;
        this.mView = mView;
    }

    public void loadServiceHistories() {

        final List<ServiceHistory> serviceHistories=serviceHistoryRepository.getServiceHistories();

        mView.ShowServiceHistories(serviceHistories);
    }

    @Override
    public void openServiceHistoryDetails(View view, int position) {



    }
}
