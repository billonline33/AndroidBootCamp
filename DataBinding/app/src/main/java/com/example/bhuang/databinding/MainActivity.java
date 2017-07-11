package com.example.bhuang.databinding;

import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.bhuang.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        MainActivityPresenter mainActivityPresenter=new MainActivityPresenter(this);
        TemperatureData temperatureData=new TemperatureData("Hamburg","10");
        binding.setTemp(temperatureData);
        binding.setPresenter(mainActivityPresenter);
    }

    @Override
    public void showData(TemperatureData temperatureData) {
        String celsius=temperatureData.getCelsius();
        Toast.makeText(this,celsius,Toast.LENGTH_LONG).show();
    }

    @Override
    public void startSecondActivity() {

    }
}
