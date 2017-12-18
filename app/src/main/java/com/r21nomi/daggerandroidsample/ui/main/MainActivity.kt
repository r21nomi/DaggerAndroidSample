package com.r21nomi.daggerandroidsample.ui.main

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import com.r21nomi.daggerandroidsample.R
import com.r21nomi.daggerandroidsample.domain.FetchRepos
import com.r21nomi.daggerandroidsample.domain.ObserveRepos
import com.r21nomi.daggerandroidsample.ui.detail.DetailActivity
import dagger.android.AndroidInjection
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var fetchRepos: FetchRepos
    @Inject lateinit var observeRepos: ObserveRepos

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.text).text = "loading..."
        findViewById<TextView>(R.id.startDetail).setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }

        fetchRepos.execute("r21nomi")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    Log.d(this.localClassName, "success")
                }, {
                    Log.e(this.localClassName, it.message, it)
                })
    }

    override fun onResume() {
        super.onResume()

        observeRepos.execute()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    findViewById<TextView>(R.id.text).text = "repository count: ${it.size}"
                }
    }
}
