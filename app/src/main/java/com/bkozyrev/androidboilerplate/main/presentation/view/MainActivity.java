package com.bkozyrev.androidboilerplate.main.presentation.view;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bkozyrev.androidboilerplate.R;
import com.bkozyrev.androidboilerplate.core.presentation.presenter.BasePresenter;
import com.bkozyrev.androidboilerplate.core.presentation.view.BaseActivity;
import com.bkozyrev.androidboilerplate.core.presentation.view.MvpView;
import com.bkozyrev.androidboilerplate.main.presentation.presenter.MainPresenter;

import javax.inject.Inject;

/**
 * Главный экран приложения.
 *
 * @author Козырев Борис
 */
public class MainActivity extends BaseActivity implements MainMvpView {

    @Inject
    MainPresenter mMainPresenter;

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public BasePresenter getPresenter() {
        return mMainPresenter;
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public MvpView getMvpView() {
        return this;
    }
}
