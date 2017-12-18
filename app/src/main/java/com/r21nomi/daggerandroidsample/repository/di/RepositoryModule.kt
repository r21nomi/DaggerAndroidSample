package com.r21nomi.daggerandroidsample.repository.di

import com.r21nomi.data.di.DataModule
import dagger.Module

/**
 * Created by Ryota Niinomi on 2017/12/18.
 */
@Module(
        includes = arrayOf(
                DataModule::class
        )
)
class RepositoryModule {
}