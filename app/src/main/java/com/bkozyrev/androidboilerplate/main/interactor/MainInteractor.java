package com.bkozyrev.androidboilerplate.main.interactor;

import com.bkozyrev.androidboilerplate.core.domain.Interactor;
import com.bkozyrev.androidboilerplate.core.rx.RxSchedulersTransformerImpl;

/**
 * Реализация сущности Interactor
 *
 * @author Козырев Борис
 */
public class MainInteractor extends Interactor {

    public MainInteractor(RxSchedulersTransformerImpl rxSchedulersTransformer) {
        super(rxSchedulersTransformer);
    }
}
