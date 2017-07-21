package com.example.bhuang.mvp.user;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bhuang.mvp.R;
import com.example.bhuang.mvp.data.IServiceHistoryRepository;
import com.example.bhuang.mvp.data.InMemoryServiceHistoryReposity;
import com.example.bhuang.mvp.databinding.ActivityUserBinding;


public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        IServiceHistoryRepository inMemoryRepository=new InMemoryServiceHistoryReposity();
        //inMemoryRepository.getUsers();

        ActivityUserBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_user);
        binding.setUser(inMemoryRepository.getUsers().get(1));

    }
}
