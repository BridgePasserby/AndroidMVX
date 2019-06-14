package com.zingking.androidmvx.mvvm.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.zingking.androidmvx.BR;

public class User extends BaseObservable {
    private String firstName;
    private String secondName;

    public User(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
        notifyPropertyChanged(BR.secondName);
    }
}
