package com.example.alarm.home;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.ExperimentalAnimationApi;
import androidx.compose.material.BackdropValue;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass;
import androidx.compose.runtime.Composable;
import com.example.alarm.data.ExploreModel;
import androidx.compose.ui.Modifier;
import com.example.alarm.R;
import com.example.alarm.base.*;
import com.example.alarm.data.EditAlarmModel;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\n\u00a2\u0006\u0002\u0010\u000bJ\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003J\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\nH\u00c6\u0003JI\u0010\u0014\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\nH\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/example/alarm/home/EatSearchContentUpdates;", "", "onPeopleChanged", "Lkotlin/Function1;", "", "", "onDateSelectionClicked", "Lkotlin/Function0;", "OnEditAlarmExploreItemClicked", "Lcom/example/alarm/data/EditAlarmModel;", "Lcom/example/alarm/home/OnEditAlarmExploreItemClicked;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getOnEditAlarmExploreItemClicked", "()Lkotlin/jvm/functions/Function1;", "getOnDateSelectionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnPeopleChanged", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class EatSearchContentUpdates {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onPeopleChanged = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onDateSelectionClicked = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.example.alarm.data.EditAlarmModel, kotlin.Unit> OnEditAlarmExploreItemClicked = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.alarm.home.EatSearchContentUpdates copy(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onPeopleChanged, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDateSelectionClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.alarm.data.EditAlarmModel, kotlin.Unit> OnEditAlarmExploreItemClicked) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public EatSearchContentUpdates(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onPeopleChanged, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDateSelectionClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.alarm.data.EditAlarmModel, kotlin.Unit> OnEditAlarmExploreItemClicked) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnPeopleChanged() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnDateSelectionClicked() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.example.alarm.data.EditAlarmModel, kotlin.Unit> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.example.alarm.data.EditAlarmModel, kotlin.Unit> getOnEditAlarmExploreItemClicked() {
        return null;
    }
}