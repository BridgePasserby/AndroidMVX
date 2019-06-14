package com.zingking.androidmvx;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zingking.androidmvx.mvvm.view.MvvmActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnMvvm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMvvm = (Button) findViewById(R.id.btn_mvvm);
        setListener();
    }

    private void setListener() {
        btnMvvm.setOnClickListener((view) -> startActivity(new Intent(this, MvvmActivity.class)));
    }
}
