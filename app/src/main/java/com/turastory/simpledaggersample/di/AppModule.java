package com.turastory.simpledaggersample.di;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tura on 2018-05-10.
 */
@Module
public class AppModule {
    private Application application;
    
    public AppModule(Application application) {
        this.application = application;
    }
    
    @Provides
    public SharedPreferences provideSharedPrefs() {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }
}
