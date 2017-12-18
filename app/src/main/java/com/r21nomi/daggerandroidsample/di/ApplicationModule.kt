package com.r21nomi.daggerandroidsample.di

import com.r21nomi.daggerandroidsample.ui.main.di.MainComponent
import dagger.Module

/**
 * Created by r21nomi on 2017/12/17.
 */
@Module(
        subcomponents = arrayOf(
                MainComponent::class
        )
)
class ApplicationModule {

}