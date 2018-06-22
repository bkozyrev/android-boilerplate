package com.bkozyrev.androidboilerplate.core.rx;

import android.support.annotation.NonNull;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Реализация {@link RxSchedulers}
 *
 * @author Козырев Борис
 */
public class RxSchedulersImpl implements RxSchedulers {

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public Scheduler getMainThreadScheduler() {
        return AndroidSchedulers.mainThread();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public Scheduler getIOScheduler() {
        return Schedulers.io();
    }
}
