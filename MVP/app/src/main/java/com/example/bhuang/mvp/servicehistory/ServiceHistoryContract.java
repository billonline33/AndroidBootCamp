package com.example.bhuang.mvp.servicehistory;

import android.support.annotation.NonNull;

import com.example.bhuang.mvp.models.ServiceHistory;

import java.util.List;

/**
 * Created by bhuang on 7/11/2017.
 */

public interface ServiceHistoryContract {
    interface View
    {
        void ShowServiceHistories(List<ServiceHistory> serviceHistories);

        void ShowServiceHistoryDetailsUI(int serviceHistoryId);
    }
    interface UserActionListener
    {
        void loadServiceHistories();

        void openServiceHistoryDetails(ServiceHistory clickedItem);

    }

}
