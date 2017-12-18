package com.r21nomi.data.repos.remote

import io.reactivex.Flowable

/**
 * Created by r21nomi on 2017/12/18.
 */
interface ReposApi {

    fun getRepos(user: String): Flowable<List<Repo>>
}