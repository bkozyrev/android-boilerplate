package com.bkozyrev.androidboilerplate.core.di.modules;

import com.bkozyrev.androidboilerplate.core.rx.IRxSchedulers;
import com.bkozyrev.androidboilerplate.core.rx.IRxSchedulersTransformer;
import com.bkozyrev.androidboilerplate.core.rx.RxSchedulers;
import com.bkozyrev.androidboilerplate.core.rx.RxSchedulersTransformer;

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
    public IRxSchedulers provideRxSchedulers() {
        return new RxSchedulers();
    }

    @Singleton
    @Provides
    public IRxSchedulersTransformer provideRxSchedulersTransformer(IRxSchedulers rxSchedulers) {
        return new RxSchedulersTransformer(rxSchedulers);
    }
}
