package com.example.bhuang.mvp.Temperature;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

import com.example.bhuang.mvp.Temperature.TemperatureContract.View;
import com.example.bhuang.mvp.data.IServiceHistoryRepository;
import com.example.bhuang.mvp.data.InMemoryServiceHistoryReposity;

/**
 * Created by bhuang on 7/20/2017.
 */

public class TemperaturePresenter implements TemperatureContract.Presenter {

    private TemperatureContract.View view;
    private Context context;

    public TemperaturePresenter(View view, Context context) {
        this.view = view;
        this.context = context;
    }

    @Override
    public void loadData() {
        // call reporsitory
        TemperatureData temperatureData;
        IServiceHistoryRepository reporitory=new InMemoryServiceHistoryReposity();
        temperatureData=reporitory.loadTemperatureDataAgain();

        //show data on UI
        view.showData(temperatureData);
    }

    @Override
    public void showList() {
        Intent i=new Intent(context,SecondActivity.class);
        context.startActivity(i);
    }
}
