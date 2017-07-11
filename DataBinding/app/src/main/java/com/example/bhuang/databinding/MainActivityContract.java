package com.example.bhuang.databinding;

import com.example.bhuang.databinding.TemperatureData;

/**
 * Created by bhuang on 6/21/2017.
 */

public interface MainActivityContract {
    public interface Presenter
    {
        void onShowData(TemperatureData temperatureData);
        void showList();
    }

    public interface View
    {
        void showData(TemperatureData temperatureData);
        void startSecondActivity();
    }
}
