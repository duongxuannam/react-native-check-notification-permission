package com.rnchecknotificationpermission;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
import com.facebook.react.bridge.ReactApplicationContext;

public class RNCheckNotificationPermissionModule extends NativeCheckNotificationSpec {
      private final ReactApplicationContext reactContext;


    RNCheckNotificationPermissionModule(ReactApplicationContext context) {
        super(context);
        this.reactContext = context;
    }

    @Override
    @NonNull
    public String getName() {
        return RNCheckNotificationPermissionModuleImpl.NAME;
    }

    @Override
    public void add(double a, double b, Promise promise) {
        RNCheckNotificationPermissionModuleImpl.add(a, b, promise);;
    }

    @Override
    public void checkNotificationPermission(Promise promise) {
        RNCheckNotificationPermissionModuleImpl.checkNotificationPermission(reactContext, promise);;
    }
    
    
    @Override
    public void goToNotificationSetting() {
        RNCheckNotificationPermissionModuleImpl.goToNotificationSetting(reactContext);;
    }

}