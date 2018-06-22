package com.bkozyrev.androidboilerplate.core.domain;

import com.bkozyrev.androidboilerplate.core.rx.RxSchedulersTransformerImpl;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;

/**
 * Базовый класс сущности Interactor для слоя domain паттерна clean architecture
 *
 * @param <T> модель данных, с которой работает Interactor
 *
 * @author Козырев Борис
 */
public class Interactor<T> {

    // трансформер для переключения потоков выполнения
    private RxSchedulersTransformerImpl rxSchedulersTransformer;

    public Interactor(RxSchedulersTransformerImpl rxSchedulersTransformer) {
        this.rxSchedulersTransformer = rxSchedulersTransformer;
    }

    /**
     * Применение {@link Scheduler} к {@link Observable}
     *
     * @param observable {@link Observable}
     * @return           {@link Observable}, выполняющийся из io в main потоках
     */
    protected Observable<T> applySchedulers(Observable<T> observable) {
        return observable.compose(rxSchedulersTransformer.getIOToMainTransformerObservable());
    }

    /**
     * Применение {@link Scheduler} к {@link Flowable}
     *
     * @param flowable {@link Flowable}
     * @return         {@link Flowable}, выполняющийся из io в main потоках
     */
    protected Flowable<T> applySchedulers(Flowable<T> flowable) {
        return flowable.compose(rxSchedulersTransformer.getIOToMainTransformerFlowable());
    }

    /**
     * Применение {@link Scheduler} к {@link Single}
     *
     * @param single {@link Single}
     * @return       {@link Single}, выполняющийся из io в main потоках
     */
    protected Single<T> applySchedulers(Single<T> single) {
        return single.compose(rxSchedulersTransformer.getIOToMainTransformerSingle());
    }

    /**
     * Применение {@link Scheduler} к {@link Maybe}
     *
     * @param maybe {@link Maybe}
     * @return      {@link Maybe}, выполняющийся из io в main потоках
     */
    protected Maybe<T> applySchedulers(Maybe<T> maybe) {
        return maybe.compose(rxSchedulersTransformer.getIOToMainTransformerMaybe());
    }

    /**
     * Применение {@link Scheduler} к {@link Completable}
     *
     * @param completable {@link Completable}
     * @return            {@link Completable}, выполняющийся из io в main потоках
     */
    protected Completable applySchedulers(Completable completable) {
        return completable.compose(rxSchedulersTransformer.getIOToMainTransformerCompletable());
    }
}
