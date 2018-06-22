package com.bkozyrev.androidboilerplate.core.di.modules;

import com.bkozyrev.androidboilerplate.core.rx.RxSchedulers;
import com.bkozyrev.androidboilerplate.core.rx.RxSchedulersImpl;
import com.bkozyrev.androidboilerplate.core.rx.RxSchedulersTransformer;
import com.bkozyrev.androidboilerplate.core.rx.RxSchedulersTransformerImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger-модуль для предоставления зависимостей из пакета io.reactivex
 *
 * @author Козырев Борис
 */
@Module
public class RxModule {

    @Singleton
    @Provides
    public RxSchedulers provideRxSchedulers() {
        return new RxSchedulersImpl();
    }

    @Singleton
    @Provides
    public RxSchedulersTransformer provideRxSchedulersTransformer(RxSchedulers rxSchedulers) {
        return new RxSchedulersTransformerImpl(rxSchedulers);
    }
}
