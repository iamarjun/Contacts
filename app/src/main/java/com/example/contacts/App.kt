package com.example.contacts

import android.app.Application
import com.example.contacts.dagger.AppComponent
import com.example.contacts.dagger.DaggerAppComponent
import com.example.contacts.dagger.NetworkModule

class App : Application() {

    companion object {
        var appComponent: AppComponent? = null
    }

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .networkModule(NetworkModule())
            .build()
    }

}