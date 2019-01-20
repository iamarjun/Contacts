package com.example.contacts

import android.app.Application
import android.content.Context
import com.example.contacts.dagger.AppComponent
import com.example.contacts.dagger.DaggerAppComponent
import com.example.contacts.dagger.module.NetworkModule

class App : Application() {

    companion object {
        lateinit var appComponent: AppComponent
        lateinit var appContext : Context
    }

    override fun onCreate() {
        super.onCreate()

        initAppComponent()
        appContext = applicationContext
    }

    fun initAppComponent() {
        appComponent = DaggerAppComponent.builder()
            .networkModule(NetworkModule())
            .build()
    }

}