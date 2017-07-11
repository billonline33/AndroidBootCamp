package com.example.bhuang.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by bhuang on 6/21/2017.
 */

public class TemperatureData extends BaseObservable {
    private String location;
    private String celsius;

    public TemperatureData(String location, String celsius){
        this.location=location;
        this.celsius=celsius;
    }

    @Bindable
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
        notifyPropertyChanged(BR.location);
    }

    @Bindable
    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
        notifyPropertyChanged(BR.celsius);
    }
}
