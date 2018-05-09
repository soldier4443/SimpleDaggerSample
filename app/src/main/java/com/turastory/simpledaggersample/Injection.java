package com.turastory.simpledaggersample;

import com.turastory.simpledaggersample.di.AppComponent;

/**
 * Created by tura on 2018-05-10.
 */
public class Injection {
    private static AppComponent component;
    
    public static AppComponent getComponent() {
        return component;
    }
    
    public static void setComponent(AppComponent component) {
        Injection.component = component;
    }
}
