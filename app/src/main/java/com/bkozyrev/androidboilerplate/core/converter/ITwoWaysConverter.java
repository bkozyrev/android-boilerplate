package com.bkozyrev.androidboilerplate.core.converter;

import android.support.annotation.NonNull;

/**
 * Днунаправленный маппер из сущности {@link From} в сущность {@link To}.
 *
 * @param <From> из
 * @param <To> в
 *
 * @author Козырев Борис
 */
public interface ITwoWaysConverter<From, To> extends IOneWayConverter<From, To> {

    /**
     * {@link To} -> {@link From}
     *
     * @param to to
     * @return from
     */
    @NonNull
    From reverse(@NonNull To to);
}
