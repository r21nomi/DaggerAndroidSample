package com.r21nomi.daggerandroidsample.repository

import com.r21nomi.data.repos.entity.Repo
import com.r21nomi.data.repos.remote.ReposApi
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.processors.BehaviorProcessor
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Ryota Niinomi on 2017/12/18.
 */
@Singleton
class ReposRepository @Inject constructor(private val reposApi: ReposApi) {

    private val reposProcessor = BehaviorProcessor.create<List<Repo>>()

    fun fetchRepos(user: String): Completable {
        return reposApi.getRepos(user)
                .subscribeOn(Schedulers.io())
                .flatMapCompletable {
                    Completable.fromCallable {
                        reposProcessor.onNext(it)
                    }
                }
    }

    fun observeRepos(): Flowable<List<Repo>> = reposProcessor.onBackpressureLatest()
}