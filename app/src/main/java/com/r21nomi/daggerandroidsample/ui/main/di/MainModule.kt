package com.r21nomi.daggerandroidsample.ui.main.di

import android.app.Activity
import com.r21nomi.daggerandroidsample.ui.main.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap



/**
 * Created by r21nomi on 2017/12/17.
 */
@Module
abstract class MainModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    internal abstract fun bindInjectorFactory(
            builder: MainComponent.Builder
    ): AndroidInjector.Factory<out Activity>
}