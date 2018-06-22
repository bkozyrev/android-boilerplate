package com.bkozyrev.androidboilerplate.core.presentation.presenter;

import android.support.annotation.NonNull;

import com.bkozyrev.androidboilerplate.core.presentation.view.MvpView;

/**
 * Реализация базовой сущности Presenter
 *
 * @param <V> Сущность {@link MvpView}
 *
 * @author Козырев Борис
 */
public class BasePresenter<V extends MvpView> implements Presenter<V> {

    // флаг, определяющий первое присоединение View к Presenter
    private boolean isFirstLaunch = true;

    // ссылка на View
    private V mvpView;

    /**
     * {@inheritDoc}
     */
    @Override
    public void attachView(@NonNull V mvpView) {
        this.mvpView = mvpView;

        if (isFirstLaunch) {
            isFirstLaunch = false;
            onFirstViewAttach();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void detachView() {
        this.mvpView = null;
    }

    /**
     * Получение ссылки на {@link MvpView}
     */
    @NonNull
    protected V getMvpView() {
        return mvpView;
    }

    /**
     * Метод обратного вызова.
     * Вызывается при первом присоединении {@link MvpView} к {@link BasePresenter}
     */
    protected void onFirstViewAttach() {
    }
}
