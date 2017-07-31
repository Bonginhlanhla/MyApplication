package com.example.admin.myapplication;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Admin on 7/18/2017.
 */

public class FireApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
