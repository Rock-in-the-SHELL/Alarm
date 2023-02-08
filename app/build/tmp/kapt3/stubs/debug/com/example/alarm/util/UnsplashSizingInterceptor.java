package com.example.alarm.util;

import coil.intercept.Interceptor;
import coil.request.ImageResult;

/**
 * A Coil [Interceptor] which appends query params to Unsplash urls to request sized images.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/example/alarm/util/UnsplashSizingInterceptor;", "Lcoil/intercept/Interceptor;", "()V", "intercept", "Lcoil/request/ImageResult;", "chain", "Lcoil/intercept/Interceptor$Chain;", "(Lcoil/intercept/Interceptor$Chain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UnsplashSizingInterceptor implements coil.intercept.Interceptor {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.alarm.util.UnsplashSizingInterceptor INSTANCE = null;
    
    private UnsplashSizingInterceptor() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object intercept(@org.jetbrains.annotations.NotNull()
    coil.intercept.Interceptor.Chain chain, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super coil.request.ImageResult> continuation) {
        return null;
    }
}