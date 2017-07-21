package com.example.bhuang.mvp.data;

import com.example.bhuang.mvp.Temperature.TemperatureData;
import com.example.bhuang.mvp.models.ServiceHistory;
import com.example.bhuang.mvp.models.ServiceHistoryDetails;
import com.example.bhuang.mvp.models.User;

import java.util.List;

/**
 * Created by bhuang on 6/28/2017.
 */

public interface IServiceHistoryRepository {

    List<ServiceHistory> getServiceHistories();

    ServiceHistory getServiceHistory(int id);

    List<ServiceHistoryDetails> getServiceHistoryDetails(int serviceHistoryId);

    List<User> getUsers();

    TemperatureData loadTemperatureData();

    TemperatureData loadTemperatureDataAgain();
}
