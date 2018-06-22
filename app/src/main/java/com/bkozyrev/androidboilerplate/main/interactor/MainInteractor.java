package com.bkozyrev.androidboilerplate.main.interactor;

import com.bkozyrev.androidboilerplate.core.domain.Interactor;
import com.bkozyrev.androidboilerplate.core.rx.RxSchedulersTransformer;
import com.bkozyrev.androidboilerplate.main.data.IMainRepository;

/**
 * Реализация сущности Interactor
 *
 * @author Козырев Борис
 */
public class MainInteractor extends Interactor {

    // репозиторий данных
    private IMainRepository mainRepository;

    public MainInteractor(RxSchedulersTransformer rxSchedulersTransformer, IMainRepository mainRepository) {
        super(rxSchedulersTransformer);
        this.mainRepository = mainRepository;
    }
}
