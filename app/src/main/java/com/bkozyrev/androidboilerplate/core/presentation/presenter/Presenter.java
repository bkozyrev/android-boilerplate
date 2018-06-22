package com.bkozyrev.androidboilerplate.core.presentation.presenter;

import com.bkozyrev.androidboilerplate.core.presentation.view.MvpView;

/**
 * Базовый интерфейс для сущности Presenter в паттерне MVP
 *
 * @author Козырев Борис
 */
public interface Presenter<V extends MvpView> {

    /**
     * Присоединение View к Presenter
     *
     * @param mvpView Сущность {@link MvpView}
     */
    void attachView(V mvpView);

    /**
     * Отсоединение View от Presenter
     */
    void detachView();
}
