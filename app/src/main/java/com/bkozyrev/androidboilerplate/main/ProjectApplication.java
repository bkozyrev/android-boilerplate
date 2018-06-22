package com.bkozyrev.androidboilerplate.main;

import android.app.Activity;
import android.app.Application;

import com.bkozyrev.androidboilerplate.core.di.component.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Application-класс всего приложения
 *
 * @author Козырев Борис
 */
public class ProjectApplication extends Application implements HasActivityInjector {

    // инжектор для поставки зависимостей в андроид компоненты
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

    /**
     * {@inheritDoc}
     */
    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder().create(this).inject(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingActivityInjector;
    }
}
