package com.nearbylocation.app.util;

import android.support.compat.BuildConfig;
import android.util.Log;

public final class LogUtil {

    public static void e(String tag, String value) {
        //if(BuildConfig.DEBUG)
            Log.e(tag, value);
    }

    public static void exception(String className, String methodName, Exception e) {
        if(BuildConfig.DEBUG)
            Log.e(className, methodName + "| " + e.toString());
    }
}
