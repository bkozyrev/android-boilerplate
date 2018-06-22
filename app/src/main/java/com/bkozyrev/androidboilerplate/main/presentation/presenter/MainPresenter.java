package com.bkozyrev.androidboilerplate.main.presentation.presenter;

import com.bkozyrev.androidboilerplate.core.presentation.presenter.BasePresenter;
import com.bkozyrev.androidboilerplate.main.interactor.MainInteractor;
import com.bkozyrev.androidboilerplate.main.presentation.view.MainMvpView;

/**
 * Реализация сущности Presenter для работы с {@link MainMvpView}
 *
 * @author Козырев Борис
 */
public class MainPresenter extends BasePresenter<MainMvpView> {

    private MainInteractor mainInteractor;

    public MainPresenter(MainInteractor mainInteractor) {
        this.mainInteractor = mainInteractor;
    }
}
