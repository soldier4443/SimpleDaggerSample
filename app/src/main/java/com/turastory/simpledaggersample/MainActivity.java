package com.turastory.simpledaggersample;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    
    @Inject
    SharedPreferences sharedPreferences;
    
    @Inject
    SomethingService service;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        Injection.getComponent().inject(this);
    
        usePrefUsingInjection();
        printPrefAndClear();
    
        usePrefUsingField();
        printPrefAndClear();
    
        try {
            service.print();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
    
    private void usePrefUsingInjection() {
        Injection.getComponent().prefs().edit()
            .putString("name", "tura")
            .apply();
    }
    
    private void usePrefUsingField() {
        sharedPreferences.edit()
            .putString("name", "tura")
            .apply();
    }
    
    private void printPrefAndClear() {
        Log.d("MainActivity", "value: " + sharedPreferences.getString("name", ""));
        sharedPreferences.edit()
            .clear()
            .apply();
    }
}
