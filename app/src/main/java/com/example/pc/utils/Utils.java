package com.example.pc.utils;

import android.app.Activity;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by pc on 2017/12/6.
 */

public class Utils {
    public static int getSystemBrightness(Activity activity) {
        int systemBrightness = 0;
        try {
            systemBrightness = Settings.System.getInt(activity.getContentResolver(), Settings.System.SCREEN_BRIGHTNESS);
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
        }
        return systemBrightness;
    }
    public static void changeAppBrightness(Activity activity,int brightness) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams lp = window.getAttributes();
        lp.screenBrightness = brightness/255.0f;
        window.setAttributes(lp);
    }
}
