package com.zingking.androidmvx.mvvm.model;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

public class ObservableFieldUser {
    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> secondName = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
}
