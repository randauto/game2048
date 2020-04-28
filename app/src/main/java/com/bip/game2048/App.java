package com.bip.game2048;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SoundManager.initSounds(this);
        SoundManager.loadSounds();
    }
}
