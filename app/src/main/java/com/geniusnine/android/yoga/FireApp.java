package com.geniusnine.android.yoga;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by AndriodDev8 on 11-01-2017.
 */

public class FireApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
