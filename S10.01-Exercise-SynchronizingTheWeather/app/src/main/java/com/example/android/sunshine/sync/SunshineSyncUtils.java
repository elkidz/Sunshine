package com.example.android.sunshine.sync;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import com.example.android.sunshine.sync.SunshineSyncIntentService;

// c (9) Create a class called SunshineSyncUtils
    //  c (10) Create a public static void method called startImmediateSync
    //  c (11) Within that method, start the SunshineSyncIntentService
public class SunshineSyncUtils {
    public static void startImmediateSync(@NonNull final Context context) {
        Intent intentToSyncImmediately = new Intent(context, SunshineSyncIntentService.class);
        context.startService(intentToSyncImmediately);
    }
}