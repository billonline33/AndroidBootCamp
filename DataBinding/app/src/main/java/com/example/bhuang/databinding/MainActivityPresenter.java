package com.example.bhuang.databinding;

/**
 * Created by bhuang on 6/21/2017.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {
    private MainActivityContract.View view;

    public MainActivityPresenter(MainActivityContract.View view)
    {
        this.view=view;
    }

    public void onShowData(TemperatureData temperatureData) {
        view.showData(temperatureData);
    }

    @Override
    public void showList() {

    }
}
