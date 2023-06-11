package com.rnchecknotificationpermission;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
import com.facebook.react.bridge.ReactApplicationContext;

public class RNCheckNotificationPermissionModule extends ReactContextBaseJavaModule {

      private final ReactApplicationContext reactContext;


    RNCheckNotificationPermissionModule(ReactApplicationContext context) {
        super(context);
        this.reactContext = context;
    }

    @Override
    public String getName() {
        return RNCheckNotificationPermissionModuleImpl.NAME;
    }

    @ReactMethod
    public void add(int a, int b, Promise promise) {
        RNCheckNotificationPermissionModuleImpl.add(a, b, promise);;
    }
    @ReactMethod
    public void checkNotificationPermission(Promise promise) {
        RNCheckNotificationPermissionModuleImpl.checkNotificationPermission(reactContext, promise);;
    }

    @ReactMethod
    public void goToNotificationSetting() {
        RNCheckNotificationPermissionModuleImpl.goToNotificationSetting(reactContext);;
    }
}