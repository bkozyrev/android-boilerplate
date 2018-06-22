package com.bkozyrev.androidboilerplate.core.di.modules;

import com.bkozyrev.androidboilerplate.main.presentation.view.MainActivity;
import com.bkozyrev.androidboilerplate.main.di.modules.MainActivityModule;
import com.bkozyrev.androidboilerplate.main.di.scopes.MainActivityScope;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Dagger-модуль, предоставляющий зависимости всем {@code Activity} приложения
 *
 * @author Козырев Борис
 */
@Module
public abstract class InjectorsModule {

    @MainActivityScope
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivityInjector();
}
