package com.bkozyrev.androidboilerplate.core.converter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.Collections;
import java.util.List;

/**
 * Базовая реализация двустороннего конвертера, поддерживающего конвертацию {@link List}
 *
 * @param <From> from
 * @param <To> to
 *
 * @author Козырев Борис
 */
public abstract class TwoWaysConverter<From, To> extends OneWayConverter<From, To>
        implements ITwoWaysConverter<From, To> {

    /**
     * Конвертирует {@link List<To>} в {@link List<From>}.
     * Если исходный список == {@code null} или пустой, то
     * возвращает {@link Collections#emptyList()}.
     *
     * @param toList    исходный {@link List<To>} до конвертации
     * @return          выходной {@link List<From>} после конвертации
     */
    @NonNull
    public List<From> reverseList(@Nullable List<To> toList) {
        return iterate(toList, this::reverse);
    }
}
