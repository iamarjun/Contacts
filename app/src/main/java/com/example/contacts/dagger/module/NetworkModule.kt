package com.example.contacts.dagger.module

import com.example.contacts.ApiCaller
import com.example.contacts.utils.Constants
import com.example.contacts.network.Client
import com.example.contacts.network.SMS
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class NetworkModule {

    internal var interceptor = HttpLoggingInterceptor()

    @Provides
    @Singleton
    internal fun provideOkHttpClient(): OkHttpClient {
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val client = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .connectTimeout(2, TimeUnit.MINUTES)
            .readTimeout(2, TimeUnit.MINUTES)
            .writeTimeout(2, TimeUnit.MINUTES)
            .addNetworkInterceptor { chain ->
                val response = chain.proceed(chain.request())
                if (response.code() == 412) {
                }

                response
            }
        return client.build()
    }

    @Provides
    @Singleton
    internal fun provideRetrofit(okHttpClient: OkHttpClient): Client =
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .build()
            .create(Client::class.java)

    @Provides
    @Singleton
    internal fun provideRetrofitSMS(okHttpClient: OkHttpClient): SMS =
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL_SMS)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .build()
            .create(SMS::class.java)

    @Provides
    @Singleton
    internal fun provideApiCaller(): ApiCaller = ApiCaller()
}