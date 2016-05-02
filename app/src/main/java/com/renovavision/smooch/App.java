package com.renovavision.smooch;

import android.app.Application;

import io.smooch.core.Smooch;

/**
 * Created by Alexandr Golovach on 02.05.16.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // init smooch
        Smooch.init(this, BuildConfig.SMOOCH_TOKEN);
    }
}
