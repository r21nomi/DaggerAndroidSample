package com.r21nomi.daggerandroidsample

import com.r21nomi.daggerandroidsample.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * Created by r21nomi on 2017/12/17.
 */
class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder().create(this)
    }
}