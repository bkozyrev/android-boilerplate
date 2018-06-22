package com.bkozyrev.androidboilerplate.core.converter;

import android.support.annotation.NonNull;

/**
 * Маппер из сущности {@link From} в сущность {@link To}.
 *
 * @param <From> из
 * @param <To> в
 *
 * @author Козырев Борис
 */
public interface IOneWayConverter<From, To> {

    /**
     * {@link From} -> {@link To}
     *
     * @param from from
     * @return to
     */
    @NonNull
    To convert(@NonNull From from);
}
