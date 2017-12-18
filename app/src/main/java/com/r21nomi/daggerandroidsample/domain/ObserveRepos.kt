package com.r21nomi.daggerandroidsample.domain

import com.r21nomi.daggerandroidsample.repository.ReposRepository
import com.r21nomi.data.repos.entity.Repo
import io.reactivex.Flowable
import javax.inject.Inject

/**
 * Created by Ryota Niinomi on 2017/12/18.
 */
class ObserveRepos @Inject constructor(private val reposRepository: ReposRepository) {

    fun execute(): Flowable<List<Repo>> = reposRepository.observeRepos()
}