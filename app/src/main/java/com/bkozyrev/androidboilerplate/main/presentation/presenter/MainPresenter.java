package com.bkozyrev.androidboilerplate.main.presentation.presenter;

import android.support.annotation.NonNull;

import com.bkozyrev.androidboilerplate.core.presentation.presenter.BasePresenter;
import com.bkozyrev.androidboilerplate.main.interactor.MainInteractor;
import com.bkozyrev.androidboilerplate.main.presentation.view.MainMvpView;

/**
 * Реализация сущности Presenter для работы с {@link MainMvpView}
 *
 * @author Козырев Борис
 */
public class MainPresenter extends BasePresenter<MainMvpView> {

    private MainInteractor mMainInteractor;

    public MainPresenter(@NonNull MainInteractor mainInteractor) {
        mMainInteractor = mainInteractor;
    }
}
