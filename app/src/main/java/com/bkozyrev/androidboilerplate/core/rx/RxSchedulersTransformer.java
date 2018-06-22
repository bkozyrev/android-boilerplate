package com.bkozyrev.androidboilerplate.core.rx;

import io.reactivex.CompletableTransformer;
import io.reactivex.FlowableTransformer;
import io.reactivex.MaybeTransformer;
import io.reactivex.ObservableTransformer;
import io.reactivex.SingleTransformer;

/**
 * {@code Interface} для получения трансофрмеров для шедулинга потоков выполнения.
 * Использовать при помощи {@code .compose}
 *
 * @author Козырев Борис
 */

public interface RxSchedulersTransformer {

    /**
     * Трансформер для Observable, переключает IO на main
     *
     * @param <T> тип внутри Observable
     * @return {@link ObservableTransformer}
     */
    <T> ObservableTransformer getIOToMainTransformerObservable();

    /**
     * Трансформер для Single, переключает c IO на main
     *
     * @param <T> тип внутри Single
     * @return {@link SingleTransformer}
     */
    <T> SingleTransformer<T, T> getIOToMainTransformerSingle();

    /**
     * Трансформер для Maybe, переключает c IO на main
     *
     * @param <T> тип внутри Maybe
     * @return {@link MaybeTransformer}
     */
    <T> MaybeTransformer<T, T> getIOToMainTransformerMaybe();

    /**
     * Трансформер для Completable, переключает c IO на main
     *
     * @return {@link CompletableTransformer}
     */
    CompletableTransformer getIOToMainTransformerCompletable();

    /**
     * Трансформер для Flowable, переключает c IO на main
     *
     * @param <T> тип внутри Flowable
     * @return {@link FlowableTransformer}
     */
    <T> FlowableTransformer<T, T> getIOToMainTransformerFlowable();
}
