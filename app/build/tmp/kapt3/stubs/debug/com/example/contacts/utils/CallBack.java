package com.example.contacts.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/example/contacts/utils/CallBack;", "T", "", "onFailure", "", "message", "", "onSuccess", "t", "(Ljava/lang/Object;)V", "app_debug"})
public abstract interface CallBack<T extends java.lang.Object> {
    
    public abstract void onSuccess(T t);
    
    public abstract void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
}