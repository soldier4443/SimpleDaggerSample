package com.turastory.simpledaggersample;

import android.app.Application;

import com.turastory.simpledaggersample.di.AppComponent;
import com.turastory.simpledaggersample.di.AppModule;
import com.turastory.simpledaggersample.di.DaggerAppComponent;

/**
 * Created by tura on 2018-05-10.
 */
public class MyApplication extends Application {
    
    @Override
    public void onCreate() {
        super.onCreate();
        
        AppComponent component = DaggerAppComponent.builder()
            .appModule(new AppModule(this))
            .build();
        
        Injection.setComponent(component);
    }
}
