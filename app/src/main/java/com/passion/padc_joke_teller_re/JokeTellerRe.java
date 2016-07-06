package com.passion.padc_joke_teller_re;

import android.app.Application;
import android.content.Context;

/**
 * Created by NayLinAung on 7/5/2016.
 */
public class JokeTellerRe extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        context = null;
    }

    public static Context getContext()
    {
        return context;
    }
}
