package com.example.contacts

import android.app.Application
import com.example.contacts.dagger.AppComponent
import com.example.contacts.dagger.DaggerAppComponent
import com.example.contacts.dagger.module.NetworkModule

class App : Application() {

    companion object {
        var appComponent: AppComponent? = null
    }

    override fun onCreate() {
        super.onCreate()

        initAppComponent()
    }

    fun initAppComponent() {
        appComponent = DaggerAppComponent.builder()
            .networkModule(NetworkModule())
            .build()
    }

}