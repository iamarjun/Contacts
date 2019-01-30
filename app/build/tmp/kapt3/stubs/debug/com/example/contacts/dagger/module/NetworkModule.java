package com.example.contacts.dagger.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\t\u001a\u00020\nH\u0001\u00a2\u0006\u0002\b\u000bJ\r\u0010\f\u001a\u00020\rH\u0001\u00a2\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0001\u00a2\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\rH\u0001\u00a2\u0006\u0002\b\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/example/contacts/dagger/module/NetworkModule;", "", "()V", "interceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "getInterceptor$app_debug", "()Lokhttp3/logging/HttpLoggingInterceptor;", "setInterceptor$app_debug", "(Lokhttp3/logging/HttpLoggingInterceptor;)V", "provideApiCaller", "Lcom/example/contacts/ApiCaller;", "provideApiCaller$app_debug", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideOkHttpClient$app_debug", "provideRetrofit", "Lcom/example/contacts/network/Client;", "okHttpClient", "provideRetrofit$app_debug", "provideRetrofitSMS", "Lcom/example/contacts/network/SMS;", "provideRetrofitSMS$app_debug", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    private okhttp3.logging.HttpLoggingInterceptor interceptor;
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.logging.HttpLoggingInterceptor getInterceptor$app_debug() {
        return null;
    }
    
    public final void setInterceptor$app_debug(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.contacts.network.Client provideRetrofit$app_debug(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.contacts.network.SMS provideRetrofitSMS$app_debug(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.contacts.ApiCaller provideApiCaller$app_debug() {
        return null;
    }
    
    public NetworkModule() {
        super();
    }
}