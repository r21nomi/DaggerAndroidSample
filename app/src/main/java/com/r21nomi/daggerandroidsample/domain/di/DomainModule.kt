package com.r21nomi.daggerandroidsample.domain.di

import com.r21nomi.daggerandroidsample.repository.di.RepositoryModule
import dagger.Module

/**
 * Created by Ryota Niinomi on 2017/12/18.
 */
@Module(
        includes = arrayOf(
                RepositoryModule::class
        )
)
class DomainModule {
}