package com.r21nomi.daggerandroidsample.ui.detail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.r21nomi.daggerandroidsample.R
import com.r21nomi.daggerandroidsample.domain.FetchRepos
import dagger.android.AndroidInjection
import javax.inject.Inject

/**
 * Created by Ryota Niinomi on 2017/12/18.
 */
class DetailActivity : AppCompatActivity() {

    @Inject lateinit var fetchRepos: FetchRepos

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }
}