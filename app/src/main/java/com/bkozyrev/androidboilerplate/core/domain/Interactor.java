package com.bkozyrev.androidboilerplate.core.domain;

import android.support.annotation.NonNull;

import com.bkozyrev.androidboilerplate.core.rx.IRxSchedulersTransformer;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;

/**
 * Базовый класс сущности Interactor для слоя domain паттерна clean architecture
 *
 * @author Козырев Борис
 */
public class Interactor {

    // трансформер для переключения потоков выполнения
    private IRxSchedulersTransformer mRxSchedulersTransformer;

    public Interactor(@NonNull IRxSchedulersTransformer rxSchedulersTransformer) {
        mRxSchedulersTransformer = rxSchedulersTransformer;
    }

    /**
     * Применение {@link Scheduler} к {@link Observable}
     *
     * @param observable {@link Observable}
     * @return           {@link Observable}, выполняющийся из io в main потоках
     */
    protected Observable applySchedulers(@NonNull Observable observable) {
        return observable.compose(mRxSchedulersTransformer.getIOToMainTransformerObservable());
    }

    /**
     * Применение {@link Scheduler} к {@link Flowable}
     *
     * @param flowable {@link Flowable}
     * @return         {@link Flowable}, выполняющийся из io в main потоках
     */
    protected Flowable applySchedulers(@NonNull Flowable flowable) {
        return flowable.compose(mRxSchedulersTransformer.getIOToMainTransformerFlowable());
    }

    /**
     * Применение {@link Scheduler} к {@link Single}
     *
     * @param single {@link Single}
     * @return       {@link Single}, выполняющийся из io в main потоках
     */
    protected Single applySchedulers(@NonNull Single single) {
        return single.compose(mRxSchedulersTransformer.getIOToMainTransformerSingle());
    }

    /**
     * Применение {@link Scheduler} к {@link Maybe}
     *
     * @param maybe {@link Maybe}
     * @return      {@link Maybe}, выполняющийся из io в main потоках
     */
    protected Maybe applySchedulers(@NonNull Maybe maybe) {
        return maybe.compose(mRxSchedulersTransformer.getIOToMainTransformerMaybe());
    }

    /**
     * Применение {@link Scheduler} к {@link Completable}
     *
     * @param completable {@link Completable}
     * @return            {@link Completable}, выполняющийся из io в main потоках
     */
    protected Completable applySchedulers(@NonNull Completable completable) {
        return completable.compose(mRxSchedulersTransformer.getIOToMainTransformerCompletable());
    }
}
