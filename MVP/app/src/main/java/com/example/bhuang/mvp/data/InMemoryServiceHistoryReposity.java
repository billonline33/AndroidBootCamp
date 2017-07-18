package com.example.bhuang.mvp.data;

import com.example.bhuang.mvp.models.ServiceHistory;
import com.example.bhuang.mvp.models.ServiceHistoryDetails;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by bhuang on 6/28/2017.
 */

public class InMemoryServiceHistoryReposity implements IServiceHistoryRepository {
    @Override
    public List<ServiceHistory> getServiceHistories() {


        List<ServiceHistory> serviceHistories=new ArrayList<ServiceHistory>();


        serviceHistories.add(new ServiceHistory(1,"00001"));
        serviceHistories.add(new ServiceHistory(2,"00002"));
        serviceHistories.add(new ServiceHistory(3,"00003"));


        ServiceHistory serviceHistory= new ServiceHistory(4,"Equipment number 00004",12.25,true,"Job Category 1", "job Number 00004", "Open", "Bill Huang", "note 0004",
                        "this is reason description", new Date());

        String dateStr="04/05/2010";
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");

        List<ServiceHistoryDetails> serviceHistoryDetailses=new ArrayList<>();
        serviceHistoryDetailses.add(new ServiceHistoryDetails("001","001 Desc",1,12,10));
        serviceHistoryDetailses.add(new ServiceHistoryDetails("002","002 Desc",2,15,1100));
        serviceHistoryDetailses.add(new ServiceHistoryDetails("003","003 Desc",3,112,110));
        serviceHistoryDetailses.add(new ServiceHistoryDetails("003","004 Desc",4,121,101));

        serviceHistory.setServiceHistoryDetailses(serviceHistoryDetailses);

        serviceHistories.add(serviceHistory);

        return serviceHistories;
    }

    @Override
    public ServiceHistory getServiceHistory(int id) {


        ServiceHistory serviceHistory= new ServiceHistory(4,"Equipment number 00004",12.25,true,"Job Category 1", "job Number 00004", "Open", "Bill Huang", "note 0004",
                "this is reason description", new Date());

        String dateStr="04/05/2010";
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");

        List<ServiceHistoryDetails> serviceHistoryDetailses=new ArrayList<>();
        serviceHistoryDetailses.add(new ServiceHistoryDetails("001","001 Desc",1,12,10));
        serviceHistoryDetailses.add(new ServiceHistoryDetails("002","002 Desc",2,15,1100));
        serviceHistoryDetailses.add(new ServiceHistoryDetails("003","003 Desc",3,112,110));
        serviceHistoryDetailses.add(new ServiceHistoryDetails("003","004 Desc",4,121,101));

        serviceHistory.setServiceHistoryDetailses(serviceHistoryDetailses);

        return serviceHistory;
    }

    @Override
    public List<ServiceHistoryDetails> getServiceHistoryDetails(int serviceHistoryId) {

        List<ServiceHistoryDetails> serviceHistoryDetailses=new ArrayList<>();
        serviceHistoryDetailses.add(new ServiceHistoryDetails("001","001 Desc",1,12,10));
        serviceHistoryDetailses.add(new ServiceHistoryDetails("002","002 Desc",2,15,1100));
        serviceHistoryDetailses.add(new ServiceHistoryDetails("003","003 Desc",3,112,110));
        serviceHistoryDetailses.add(new ServiceHistoryDetails("003","004 Desc",4,121,101));

        return serviceHistoryDetailses;

    }
}
