package com.r21nomi.data.repos.remote

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

/**
 * Created by r21nomi on 2017/12/18.
 */
@Module
abstract class ReposModule {

    @Binds
    @Singleton
    abstract fun provideReposApi(reposApiClient: ReposApiClient): ReposApi
}