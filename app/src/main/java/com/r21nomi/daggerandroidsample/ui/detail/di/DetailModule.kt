package com.r21nomi.daggerandroidsample.ui.detail.di

import com.r21nomi.daggerandroidsample.ui.detail.DetailActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Ryota Niinomi on 2017/12/18.
 */
@Module
abstract class DetailModule {

    // Don't have to define Subcomponent since the Subcomponent and its Builder have no other methods.
    @ContributesAndroidInjector
    abstract fun detailActivity(): DetailActivity
}