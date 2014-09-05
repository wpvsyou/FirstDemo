package util;

import android.util.Log;

/**
 * Created by wangpeng on 14-9-5.
 */
public class Util {

    public static boolean ENABLE_DEBUG = true;
    private static String TAG = "Silence.W";

    public static void log(String msg) {

        if (ENABLE_DEBUG) {
            StackTraceElement st = Thread.currentThread().getStackTrace()[3];
            Log.d(TAG, "[" + st.getFileName() + ":" + st.getLineNumber() + "]->" + msg);
        }
    }
}
