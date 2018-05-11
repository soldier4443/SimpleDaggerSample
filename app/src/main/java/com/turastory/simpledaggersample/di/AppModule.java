package com.turastory.simpledaggersample.di;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import com.turastory.simpledaggersample.SomethingService;

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
    
    @Provides
    public SomethingService provideSomethingService() {
        return new SomethingService() {
            @Override
            public void print() {
                Log.d("Something", "Hello..!");
            }
        };
    }
}
