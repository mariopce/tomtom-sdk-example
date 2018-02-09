package com.example.mapdisplay;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created on 1-2-18.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }
}
