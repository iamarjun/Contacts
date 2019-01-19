package com.example.contacts.dagger

import com.example.contacts.ApiCaller
import com.example.contacts.contacts.ContactsPresenter
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkModule::class])
interface AppComponent {
    fun inject(apiCaller: ApiCaller)
    fun inject(presenter: ContactsPresenter)
}