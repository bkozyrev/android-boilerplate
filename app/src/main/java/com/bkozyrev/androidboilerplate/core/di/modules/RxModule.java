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
public interface RxModule {

    @Singleton
    @Provides
    static IRxSchedulers provideRxSchedulers() {
        return new RxSchedulers();
    }

    @Singleton
    @Provides
    static IRxSchedulersTransformer provideRxSchedulersTransformer(IRxSchedulers rxSchedulers) {
        return new RxSchedulersTransformer(rxSchedulers);
    }
}
