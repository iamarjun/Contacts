package com.example.contacts.dagger

import com.example.contacts.ApiCaller
import com.example.contacts.Constants
import com.example.contacts.network.Client
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    internal fun provideRetrofit(): Client =
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(Client::class.java)

    @Provides
    @Singleton
    internal fun provideApiCaller(): ApiCaller = ApiCaller()
}