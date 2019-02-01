package com.bkozyrev.androidboilerplate.core.di.modules;

import android.content.Context;

import com.bkozyrev.androidboilerplate.main.ProjectApplication;
import com.bkozyrev.androidboilerplate.core.di.scopes.ApplicationContext;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger-модуль для предоставления экземпляров {@link ApplicationContext} {@link Context}.
 * Обязателен к подключению к компонентам уровня приложения.
 *
 * @author Козырев Борис
 */

@Module
public interface ApplicationModule {

    @Provides
    static Context provideApplicationContext(ProjectApplication application) {
        return application.getApplicationContext();
    }
}
