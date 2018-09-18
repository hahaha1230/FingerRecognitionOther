package com.example.myapplication.log;

import android.util.Log;

import com.example.myapplication.BuildConfig;

/**
 * Created by 佳佳 on 2018/9/17.
 */

public class FPLog {

    public static void log(String message) {
        if (BuildConfig.DEBUG) {
            Log.i("FPLog", message);
        }
    }
}
