package com.r21nomi.data.repos.remote

import android.content.Context
import io.reactivex.Flowable
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path
import javax.inject.Inject

/**
 * Created by r21nomi on 2017/12/18.
 */
class ReposApiClient internal constructor(context: Context, private val service: Service): ReposApi {

    @Inject
    constructor(context: Context, retrofit: Retrofit) : this(context, retrofit.create(Service::class.java))

    override fun getRepos(user: String): Flowable<List<Repo>> {
        return service.getRepos(user)
    }

    internal interface Service {
        @GET("/users/{user}/repos")
        fun getRepos(@Path("user") user: String): Flowable<List<Repo>>
    }
}