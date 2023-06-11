package com.rnchecknotificationpermission;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import java.util.Map;
import java.util.HashMap;
import com.facebook.react.bridge.ReactApplicationContext;
import androidx.core.app.NotificationManagerCompat;
import android.content.Intent;

public class RNCheckNotificationPermissionModuleImpl {

    public static final String NAME = "RNRNCheckNotificationPermission";


    public static void add(double a, double b, Promise promise) {
        promise.resolve(a + b);
    }

    public static void checkNotificationPermission(ReactApplicationContext reactContext, Promise promise) {
        boolean hasPermission = NotificationManagerCompat.from(reactContext).areNotificationsEnabled();
        promise.resolve(hasPermission ? 1 : 0);    
    }

    public static void goToNotificationSetting(ReactApplicationContext reactContext) {
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS"); // Settings.ACTION_APP_NOTIFICATION_SETTINGS
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

        //for Android 5-7
        intent.putExtra("app_package", reactContext.getPackageName());
        intent.putExtra("app_uid", reactContext.getApplicationInfo().uid);

        // for Android 8 and above
        intent.putExtra("android.provider.extra.APP_PACKAGE", reactContext.getPackageName()); // Settings.EXTRA_APP_PACKAGE

        if (intent.resolveActivity(reactContext.getPackageManager()) != null) {
            reactContext.startActivity(intent);
        }
    }

}