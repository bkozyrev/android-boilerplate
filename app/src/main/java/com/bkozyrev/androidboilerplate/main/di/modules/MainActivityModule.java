package com.bkozyrev.androidboilerplate.main.di.modules;

import com.bkozyrev.androidboilerplate.core.rx.RxSchedulersTransformerImpl;
import com.bkozyrev.androidboilerplate.main.di.scopes.MainActivityScope;
import com.bkozyrev.androidboilerplate.main.interactor.MainInteractor;
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
    public static MainPresenter provideMainScreenPresenter(MainInteractor mainInteractor) {
        return new MainPresenter(mainInteractor);
    }

    @Provides
    @MainActivityScope
    public static MainInteractor provideMainScreenInteractor(RxSchedulersTransformerImpl rxSchedulersTransformer) {
        return new MainInteractor(rxSchedulersTransformer);
    }
}
