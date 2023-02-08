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

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/alarm/home/SplashState;", "", "(Ljava/lang/String;I)V", "Shown", "Completed", "app_debug"})
public enum SplashState {
    /*public static final*/ Shown /* = new Shown() */,
    /*public static final*/ Completed /* = new Completed() */;
    
    SplashState() {
    }
}