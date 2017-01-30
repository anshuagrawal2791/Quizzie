package com.edu.cognitio.quizzie;

import android.app.Application;
import android.content.Context;

import com.parse.Parse;
import com.parse.ParseFacebookUtils;

/**
 * Created by anshu on 30/10/15.
 */
public class MyApp extends Application {


    private static MyApp inst;


    @Override
    public void onCreate() {
        super.onCreate();
        inst = this;
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "cHugST8AC9j6AaU1K1PVlwjRRJmzA88EboIzcQM9", "NiHGx58BBzUNFO0MB9scxUcSfYMYmSPJwT17U6yK");



        ParseFacebookUtils.initialize(this);
//        ParseUser.enableAutomaticUser();
//        ParseACL defaultACL = new ParseACL();
//
//        // If you would like all objects to be private by default, remove this
//        // line.
//        defaultACL.setPublicReadAccess(true);
//
//        ParseACL.setDefaultACL(defaultACL, true);
    }
    public static MyApp getInst(){
        return inst;

    }
    public static Context getAppContext()
    {
        return inst.getApplicationContext();
    }

}
