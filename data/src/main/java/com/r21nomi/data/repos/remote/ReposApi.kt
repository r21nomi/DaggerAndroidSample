package com.r21nomi.data.repos.remote

import com.r21nomi.data.repos.entity.Repo
import io.reactivex.Single

/**
 * Created by r21nomi on 2017/12/18.
 */
interface ReposApi {

    fun getRepos(user: String): Single<List<Repo>>
}