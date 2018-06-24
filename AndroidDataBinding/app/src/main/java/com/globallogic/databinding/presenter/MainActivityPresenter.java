package com.globallogic.databinding.presenter;

import com.globallogic.databinding.view.MainActivityInterface;

/**
 * @author Abdul Mateen
 * Presenter for main activity
 */
public class MainActivityPresenter {

    private MainActivityInterface mActivityInterface;

    public MainActivityPresenter(MainActivityInterface activityInterface) {
        mActivityInterface = activityInterface;
    }

    public void showEmployeeDetails() {
        mActivityInterface.showEmployeeDetails();
    }
}
