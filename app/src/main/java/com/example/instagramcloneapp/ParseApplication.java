package com.example.instagramcloneapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        // Register your parse models
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("da7B84lsjdHTgzhHUs0ahe0SjylDsHNzicc5t4jw")
                .clientKey("k6Y6VaCxUDk5HvwrL3V1BPMtOhugjRaHEOQZjEMw")
                .server("https://parseapi.back4app.com").build()

        );
    }
}