package com.bkozyrev.androidboilerplate.core.di.component;

import com.bkozyrev.androidboilerplate.core.di.modules.ApplicationModule;
import com.bkozyrev.androidboilerplate.core.di.modules.InjectorsModule;
import com.bkozyrev.androidboilerplate.core.di.modules.NetworkModule;
import com.bkozyrev.androidboilerplate.core.di.modules.RxModule;
import com.bkozyrev.androidboilerplate.main.ProjectApplication;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Компонент приложения, включающий в себя все Dagger-модули базового слоя, необходимые для работы приложения
 *
 * @author Козырев Борис
 */
@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, InjectorsModule.class, RxModule.class,
        ApplicationModule.class, NetworkModule.class})
public interface AppComponent extends AndroidInjector<ProjectApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<ProjectApplication> {
    }
}