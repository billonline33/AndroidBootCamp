package com.example.bhuang.mvp.Temperature;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.bhuang.mvp.R;
import com.example.bhuang.mvp.data.IServiceHistoryRepository;
import com.example.bhuang.mvp.data.InMemoryServiceHistoryReposity;
import com.example.bhuang.mvp.databinding.ActivityTemperatureBinding;

public class TemperatureActivity extends AppCompatActivity implements TemperatureContract.View{

    private TemperaturePresenter presenter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        //presenter.loadData();

        IServiceHistoryRepository inMemoryRepository=new InMemoryServiceHistoryReposity();

        ActivityTemperatureBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_temperature);

        binding.setTemp(inMemoryRepository.loadTemperatureData());

        presenter=new TemperaturePresenter(this,getApplicationContext());

        binding.setPresenter(presenter);
    }

    @Override
    public void showData(TemperatureData temperatureData) {
        String celsius=temperatureData.getCelsius();
        Toast.makeText(this,celsius,Toast.LENGTH_LONG).show();
    }
}
