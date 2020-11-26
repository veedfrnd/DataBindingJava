package com.databinding.app.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.databinding.app.models.User;

public class MainViewModel extends AndroidViewModel {
    private User user;

    public MainViewModel(@NonNull Application application) {
        super(application);
        user = new User("Prashant", 32);
    }



    public User getUser() {
        return user;
    }
}
