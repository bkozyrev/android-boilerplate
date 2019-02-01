package com.bkozyrev.androidboilerplate.main.di.modules;

import com.bkozyrev.androidboilerplate.core.rx.IRxSchedulersTransformer;
import com.bkozyrev.androidboilerplate.main.data.IMainRepository;
import com.bkozyrev.androidboilerplate.main.data.MainRepository;
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
public interface MainActivityModule {

    @Provides
    @MainActivityScope
    static MainPresenter provideMainScreenPresenter(MainInteractor mainInteractor) {
        return new MainPresenter(mainInteractor);
    }

    @Provides
    @MainActivityScope
    static MainInteractor provideMainScreenInteractor(IRxSchedulersTransformer rxSchedulersTransformer,
                                                             IMainRepository mainRepository) {
        return new MainInteractor(rxSchedulersTransformer, mainRepository);
    }

    @Provides
    @MainActivityScope
    static IMainRepository provideMainScreenRepository() {
        return new MainRepository();
    }
}
