package com.bkozyrev.androidboilerplate.main.di.modules;

import com.bkozyrev.androidboilerplate.main.di.scopes.MainActivityScope;
import com.bkozyrev.androidboilerplate.main.presentation.presenter.MainPresenter;
import com.bkozyrev.androidboilerplate.main.presentation.view.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger-модуль для предоставления завимостей, связанных с {@link MainActivity}
 */
@Module
public class MainActivityModule {

    @Provides
    @MainActivityScope
    public static MainPresenter provideMainScreenPresenter() {
        return new MainPresenter();
    }
}
