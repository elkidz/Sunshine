package com.example.android.sunshine.sync;

import android.app.IntentService;
import android.content.Intent;

// c (5) Create a new class called SunshineSyncIntentService that extends IntentService

public class SunshineSyncIntentService extends IntentService {

    //  c (6) Create a constructor that calls super and passes the name of this class

    public SunshineSyncIntentService() {
        super("SunshineSyncIntentService");
    }

    //  c (7) Override onHandleIntent, and within it, call SunshineSyncTask.syncWeather
    @Override
    protected void onHandleIntent(Intent intent) {
        SunshineSyncTask.syncWeather(this);
    }
}