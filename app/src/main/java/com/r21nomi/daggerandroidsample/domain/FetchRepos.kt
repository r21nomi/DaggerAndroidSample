package com.r21nomi.daggerandroidsample.domain

import com.r21nomi.daggerandroidsample.repository.ReposRepository
import io.reactivex.Completable
import javax.inject.Inject

/**
 * Created by Ryota Niinomi on 2017/12/18.
 */
class FetchRepos @Inject constructor(private val reposRepository: ReposRepository) {

    fun execute(user: String): Completable = reposRepository.fetchRepos(user)
}