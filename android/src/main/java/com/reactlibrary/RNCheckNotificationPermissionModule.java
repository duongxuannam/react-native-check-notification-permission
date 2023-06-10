
package com.reactlibrary;

import android.widget.Toast;
import android.content.Intent;
import androidx.core.app.NotificationManagerCompat;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;

public class RNCheckNotificationPermissionModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNCheckNotificationPermissionModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNCheckNotificationPermission";
  }

    @ReactMethod
  public void checkNotificationPermission(Promise promise) {
    boolean hasPermission = NotificationManagerCompat.from(getReactApplicationContext()).areNotificationsEnabled();
    promise.resolve(new Boolean(hasPermission));
  }

      @ReactMethod
    public void changeNotificationSetting() {
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