package com.databinding.app.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.databinding.app.R;
import com.databinding.app.databinding.ActivityMainBinding;
import com.databinding.app.viewmodels.MainViewModel;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;
    private MainViewModel viewModel;
    //dfgfdgd

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewModel = new ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(this.getApplication()))
                .get(MainViewModel.class);
        binding.setUser(viewModel.getUser());
    }
}