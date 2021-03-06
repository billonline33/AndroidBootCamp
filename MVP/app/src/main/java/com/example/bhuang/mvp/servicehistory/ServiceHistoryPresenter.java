package com.example.bhuang.mvp.servicehistory;

import com.example.bhuang.mvp.data.IServiceHistoryRepository;
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
    public void openServiceHistoryDetails(ServiceHistory clickedItem) {
        //call View to Display the Model data. This is implemented in Activity (View).
        mView.ShowServiceHistoryDetailsUI(clickedItem.getId());
    }
}
