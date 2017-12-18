package com.r21nomi.daggerandroidsample.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.r21nomi.daggerandroidsample.R
import dagger.android.AndroidInjection

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
