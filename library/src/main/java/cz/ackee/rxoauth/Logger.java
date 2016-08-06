package cz.ackee.rxoauth;

import android.util.Log;

/**
 * Simple logger
 * Created by David Bilik[david.bilik@ackee.cz] on {05/08/16}
 **/
public class Logger {
    public static final String TAG = Logger.class.getName();
    private static boolean logging;

    private Logger() {
        logging = BuildConfig.DEBUG;
    }

    public static void d(String msg) {
        if (logging) {
            Log.d(TAG, msg);
        }
    }
}
