package com.example.bhuang.mvp.servicehistorydetails;

/**
 * Created by bhuang on 7/17/2017.
 */
import com.example.bhuang.mvp.data.IServiceHistoryRepository;
import com.example.bhuang.mvp.models.ServiceHistoryDetails;
import com.example.bhuang.mvp.servicehistorydetails.ServiceHistoryDetailsContract;

import java.util.List;

public class ServiceHistoryDetailsPresenter implements ServiceHistoryDetailsContract.UserActionListener {

    private final IServiceHistoryRepository mServiceHistoryRepository;
    private ServiceHistoryDetailsContract.View mView;

    public ServiceHistoryDetailsPresenter(IServiceHistoryRepository serviceHistoryDetailses, ServiceHistoryDetailsContract.View view) {
        mServiceHistoryRepository = serviceHistoryDetailses;
        mView=view;
    }

    public void loadServiceHistoryDetails(int serviceHistoryId) {

        final List<ServiceHistoryDetails> listServiceHistoryDetails=mServiceHistoryRepository.getServiceHistoryDetails(serviceHistoryId);

        mView.ShowServiceHistoryDetails(listServiceHistoryDetails);
    }
}
