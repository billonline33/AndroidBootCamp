package com.example.bhuang.mvp.Temperature;

/**
 * Created by bhuang on 7/20/2017.
 */

public interface TemperatureContract {
    public  interface View{
        void showData(TemperatureData temperatureData);
    }

    public interface Presenter{
        void loadData();
        void showList();
    }


}
