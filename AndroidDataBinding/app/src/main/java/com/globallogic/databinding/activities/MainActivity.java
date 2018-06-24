package com.globallogic.databinding.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.globallogic.databinding.R;
import com.globallogic.databinding.databinding.MainActivityBinding;
import com.globallogic.databinding.presenter.MainActivityPresenter;
import com.globallogic.databinding.view.MainActivityInterface;

/**
 * @author : Abdul Mateen
 * Describes the behaviour of main screen
 */
public class MainActivity  extends AppCompatActivity implements MainActivityInterface {

    private MainActivityPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPresenter = new MainActivityPresenter(this);

        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
        binding.setPresenter(mPresenter);
    }

    @Override
    public void showEmployeeDetails() {
        Intent intent = new Intent(this, EmployeeDetailsActivity.class);
        startActivity(intent);
    }
}
