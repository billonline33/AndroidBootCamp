package com.example.bhuang.mvp.servicehistorydetails;

import com.example.bhuang.mvp.models.ServiceHistory;
import com.example.bhuang.mvp.models.ServiceHistoryDetails;

import java.util.List;

/**
 * Created by bhuang on 7/17/2017.
 */

public interface ServiceHistoryDetailsContract {
    interface View
    {
        void ShowServiceHistoryDetails(List<ServiceHistoryDetails> listServiceHistoryDetails);

    }

    interface UserActionListener
    {
        void loadServiceHistoryDetails(int serviceHostorydetailsId);

    }
}
