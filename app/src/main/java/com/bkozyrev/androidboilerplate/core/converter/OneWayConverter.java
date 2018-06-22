package com.bkozyrev.androidboilerplate.core.converter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import kotlin.jvm.functions.Function1;

/**
 * Базовая реализация одностороннего конвертера, поддерживающего конвертацию {@link List}
 *
 * @param <From> from
 * @param <To>   to
 *
 * @author Козырев Борис
 */
public abstract class OneWayConverter<From, To> implements IOneWayConverter<From, To> {

    /**
     * Конвертирует {@link List<From>} в {@link List<To>}.
     * Если исходный список == {@code null} или пустой, то
     * возвращает {@link Collections#emptyList()}.
     *
     * @param fromList  исходный {@link List<From>} до конвертации
     * @return          выходной {@link List<To>} после конвертации
     */
    @NonNull
    public List<To> convertList(@Nullable List<From> fromList) {
        return iterate(fromList, this::convert);
    }

    /**
     * Итерация по {@link List} с последовательной конвертацией каждого элемента.
     *
     * @param source            исходная коллекция
     * @param convertFunction   extention-функция для конвертации
     * @param <F>               from
     * @param <T>               to
     * @return                  {@link List<T>}
     */
    @NonNull
    static <F, T> List<T> iterate(@Nullable List<F> source, Function1<F, T> convertFunction) {
        if (source == null || source.isEmpty()) {
            return Collections.emptyList();
        }

        List<T> result = new ArrayList<>();
        for (F from : source) {
            result.add(convertFunction.invoke(from));
        }

        return result;
    }
}
