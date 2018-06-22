package com.bkozyrev.androidboilerplate.core.rx;

import io.reactivex.CompletableTransformer;
import io.reactivex.FlowableTransformer;
import io.reactivex.MaybeTransformer;
import io.reactivex.ObservableTransformer;
import io.reactivex.SingleTransformer;

/**
 * Реализация {@link IRxSchedulersTransformer}
 *
 * @author Козырев Борис
 */
public class RxSchedulersTransformer implements IRxSchedulersTransformer {

    private IRxSchedulers mRxSchedulers;

    public RxSchedulersTransformer(IRxSchedulers rxSchedulers) {
        mRxSchedulers = rxSchedulers;
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public <T> ObservableTransformer<T, T> getIOToMainTransformerObservable() {
        return (ObservableTransformer) observable -> observable.subscribeOn(mRxSchedulers.getIOScheduler())
                .observeOn(mRxSchedulers.getMainThreadScheduler());
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public <T> SingleTransformer<T, T> getIOToMainTransformerSingle() {
        return (SingleTransformer) single -> single.subscribeOn(mRxSchedulers.getIOScheduler())
                .observeOn(mRxSchedulers.getMainThreadScheduler());
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public <T> MaybeTransformer<T, T> getIOToMainTransformerMaybe() {
        return (MaybeTransformer) maybe -> maybe.subscribeOn(mRxSchedulers.getIOScheduler())
                .observeOn(mRxSchedulers.getMainThreadScheduler());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompletableTransformer getIOToMainTransformerCompletable() {
        return completable -> completable.subscribeOn(mRxSchedulers.getIOScheduler())
                .observeOn(mRxSchedulers.getMainThreadScheduler());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T> FlowableTransformer<T, T> getIOToMainTransformerFlowable() {
        return flowable -> flowable.subscribeOn(mRxSchedulers.getIOScheduler())
                .observeOn(mRxSchedulers.getMainThreadScheduler());
    }
}
