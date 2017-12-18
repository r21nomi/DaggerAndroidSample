package com.r21nomi.daggerandroidsample.di

import com.r21nomi.daggerandroidsample.App
import com.r21nomi.daggerandroidsample.domain.di.DomainModule
import com.r21nomi.daggerandroidsample.ui.main.di.MainModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by r21nomi on 2017/12/17.
 */
@Singleton
@Component(
        modules = arrayOf(
                AndroidSupportInjectionModule::class,
                ApplicationModule::class,
                MainModule::class,
                DomainModule::class
        )
)
interface ApplicationComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}