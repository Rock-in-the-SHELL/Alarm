package com.example.alarm;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = AlarmApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface AlarmApplication_GeneratedInjector {
  void injectAlarmApplication(AlarmApplication alarmApplication);
}
