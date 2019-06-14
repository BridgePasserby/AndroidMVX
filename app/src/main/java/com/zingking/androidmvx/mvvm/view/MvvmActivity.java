package com.zingking.androidmvx.mvvm.view;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.zingking.androidmvx.R;
import com.zingking.androidmvx.databinding.ActivityMvvmBinding;
import com.zingking.androidmvx.mvvm.model.ObservableFieldUser;
import com.zingking.androidmvx.mvvm.model.User;

public class MvvmActivity extends AppCompatActivity {

//    private Button btnChange;
//    private Button btnChange1;
    private ActivityMvvmBinding mvvmBinding;
    private User user;
    private ObservableFieldUser fieldUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mvvmBinding = DataBindingUtil.setContentView(this, R.layout.activity_mvvm);
        initView();
        initData();
        setListener();
    }

    private void setListener() {
        // 数据的改变直接会更新ui，不需要调用setText
        mvvmBinding.btnChange.setOnClickListener((view) -> {
            user.setFirstName("Kevin");
            user.setSecondName("Zhang");
        });
        mvvmBinding.btnChange1.setOnClickListener((view) -> {
            fieldUser.firstName.set("Kevin");
            fieldUser.secondName.set("Zhang");
            fieldUser.age.set(22);
        });
    }

    private void initView() {
        // mvvmBinding = ActivityMvvmBinding.inflate(getLayoutInflater()); // 这里调用setUser时不生效
//        btnChange = (Button) findViewById(R.id.btn_change);
//        btnChange1 = (Button) findViewById(R.id.btn_change_1);
    }

    private void initData() {
        user = new User("Test", "User");
        mvvmBinding.setUser(user);

        fieldUser = new ObservableFieldUser();
        fieldUser.firstName.set("Test");
        fieldUser.secondName.set("FieldUser");
        mvvmBinding.setFieldUser(fieldUser);
    }
}
