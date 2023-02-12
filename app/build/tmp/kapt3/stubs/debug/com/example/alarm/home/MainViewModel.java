package com.example.alarm.home;

import com.example.alarm.data.ExploreModel;
import com.example.alarm.di.DefaultDispatcher;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.alarm.data.EditAlarmModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineDispatcher;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0016"}, d2 = {"Lcom/example/alarm/home/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "_suggestedDestinations", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/alarm/data/ExploreModel;", "shownSplash", "Landroidx/compose/runtime/MutableState;", "Lcom/example/alarm/home/SplashState;", "getShownSplash", "()Landroidx/compose/runtime/MutableState;", "suggestedDestinations", "Landroidx/lifecycle/LiveData;", "getSuggestedDestinations", "()Landroidx/lifecycle/LiveData;", "updatePeople", "", "people", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<com.example.alarm.home.SplashState> shownSplash = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.alarm.data.ExploreModel>> _suggestedDestinations = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    @com.example.alarm.di.DefaultDispatcher()
    kotlinx.coroutines.CoroutineDispatcher defaultDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<com.example.alarm.home.SplashState> getShownSplash() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.alarm.data.ExploreModel>> getSuggestedDestinations() {
        return null;
    }
    
    public final void updatePeople(int people) {
    }
}