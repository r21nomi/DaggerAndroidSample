package com.r21nomi.daggerandroidsample.ui.main.di

import com.r21nomi.daggerandroidsample.ui.main.MainActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by r21nomi on 2017/12/17.
 */
@Subcomponent
interface MainComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}