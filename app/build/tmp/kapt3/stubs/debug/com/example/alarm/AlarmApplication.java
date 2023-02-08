package com.example.alarm;

import android.app.Application;
import com.example.alarm.util.UnsplashSizingInterceptor;
import coil.ImageLoaderFactory;
import dagger.hilt.android.HiltAndroidApp;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/example/alarm/AlarmApplication;", "Landroid/app/Application;", "Lcoil/ImageLoaderFactory;", "()V", "newImageLoader", "Lcoil/ImageLoader;", "app_debug"})
@dagger.hilt.android.HiltAndroidApp()
public final class AlarmApplication extends android.app.Application implements coil.ImageLoaderFactory {
    
    public AlarmApplication() {
        super();
    }
    
    /**
     * Create the singleton [ImageLoader].
     * This is used by [AsyncImage] to load images in the app.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public coil.ImageLoader newImageLoader() {
        return null;
    }
}