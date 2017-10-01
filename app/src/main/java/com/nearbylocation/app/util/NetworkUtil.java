package com.nearbylocation.app.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.nearbylocation.app.App;

public class NetworkUtil {

	public static Boolean checkInternet() {
    	ConnectivityManager cm = (ConnectivityManager) App.applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
	}

}
