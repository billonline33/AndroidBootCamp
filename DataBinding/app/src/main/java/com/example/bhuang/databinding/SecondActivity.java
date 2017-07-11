package com.example.bhuang.databinding;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.bhuang.databinding.databinding.ActivitySecondBinding;


// reference: http://www.developer.com/ws/android/programming/how-to-use-android-data-binding.html
public class SecondActivity extends AppCompatActivity {
    TextView unbound;
    TextView bound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TemperatureData temperatureData=new TemperatureData("Hamburg","10");

        //unbound=(TextView)findViewById(R.id.textViewUnBound);

        //unbound.setText("This is unBound Text!");


        ActivitySecondBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_second);
        binding.setTemp(temperatureData);



    }



    @BindingAdapter("bind:text")
    public  static void loadText(TextView textView, String text)
    {
       textView.setText("New text added by binding adapter" + text);
    }

    @BindingAdapter("app:bindColor")
    public static void setTextColor(TextView textView, String color)
    {
        if ("green".equals(color))
            textView.setTextColor(Color.parseColor("#63f421"));
    }
}
