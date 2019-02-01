package com.bkozyrev.androidboilerplate.main.interactor;

import android.support.annotation.NonNull;

import com.bkozyrev.androidboilerplate.core.domain.Interactor;
import com.bkozyrev.androidboilerplate.core.rx.IRxSchedulersTransformer;
import com.bkozyrev.androidboilerplate.main.data.IMainRepository;

/**
 * Реализация сущности Interactor
 *
 * @author Козырев Борис
 */
public class MainInteractor extends Interactor {

    // репозиторий данных
    private IMainRepository mMainRepository;

    public MainInteractor(@NonNull IRxSchedulersTransformer rxSchedulersTransformer, @NonNull IMainRepository mainRepository) {
        super(rxSchedulersTransformer);
        mMainRepository = mainRepository;
    }
}
