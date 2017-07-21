package com.example.bhuang.mvp.Temperature;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.bhuang.mvp.BR;


/**
 * Created by bhuang on 7/19/2017.
 */

public class TemperatureData extends BaseObservable {
    private String location;
    private String celsius;

    public TemperatureData(String location, String celsius) {
        this.location = location;
        this.celsius = celsius;
    }

    @Bindable  //The Bindable annotation should be applied to any getter accessor method of an Observable class. Bindable will generate a field in the BR class to identify the field that has changed.
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
