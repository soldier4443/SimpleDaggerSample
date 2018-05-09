package com.turastory.simpledaggersample.di;

import android.content.SharedPreferences;

import com.turastory.simpledaggersample.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by tura on 2018-05-10.
 */
@Singleton
@Component(modules = {
    AppModule.class
})
public interface AppComponent {
    void inject(MainActivity mainActivity);
    
    SharedPreferences prefs();
}
