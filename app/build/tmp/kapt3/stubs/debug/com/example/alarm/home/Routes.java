package com.example.alarm.home;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.annotation.VisibleForTesting;
import androidx.compose.animation.core.*;
import androidx.compose.foundation.layout.*;
import androidx.compose.material.*;
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi;
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.WindowCompat;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/alarm/home/Routes;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "Calendar", "Home", "Lcom/example/alarm/home/Routes$Home;", "Lcom/example/alarm/home/Routes$Calendar;", "app_debug"})
public abstract class Routes {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    
    private Routes(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/alarm/home/Routes$Home;", "Lcom/example/alarm/home/Routes;", "()V", "app_debug"})
    public static final class Home extends com.example.alarm.home.Routes {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.alarm.home.Routes.Home INSTANCE = null;
        
        private Home() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/alarm/home/Routes$Calendar;", "Lcom/example/alarm/home/Routes;", "()V", "app_debug"})
    public static final class Calendar extends com.example.alarm.home.Routes {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.alarm.home.Routes.Calendar INSTANCE = null;
        
        private Calendar() {
            super(null);
        }
    }
}