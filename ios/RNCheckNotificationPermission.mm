#import "RNCheckNotificationPermission.h"
// Thanks to this guard, we won't import this header when we build for the old architecture.
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNCheckNotificationPermissionSpec.h"
#endif


#import "rNCheckNotificationPermission-Swift.h"

@implementation RNCheckNotificationPermission

RCT_EXPORT_MODULE()

RCT_REMAP_METHOD(add, addA:(NSInteger)a
                        andB:(NSInteger)b
                withResolver:(RCTPromiseResolveBlock) resolve
                withRejecter:(RCTPromiseRejectBlock) reject)
{
  return [self add:a b:b resolve:resolve reject:reject];
}

RCT_REMAP_METHOD(checkNotificationPermission,
                withResolver:(RCTPromiseResolveBlock) resolve
                withRejecter:(RCTPromiseRejectBlock) reject)
{
  return [self checkNotificationPermission:resolve reject:reject];
}

RCT_EXTERN_METHOD(goToNotificationSetting)


// Thanks to this guard, we won't compile this code when we build for the old architecture.
#ifdef RCT_NEW_ARCH_ENABLED
- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeModuleSpecJSI>(params);
}
#endif

- (void)add:(double)a b:(double)b resolve:(RCTPromiseResolveBlock)resolve reject:(RCTPromiseRejectBlock)reject {
  NSNumber *result = @([CheckNotificationPermission addWithA:a b:b]);
  // NSNumber *result = [[NSNumber alloc] initWithInteger:a+b];
  resolve(result);
}

- (void)checkNotificationPermission:(RCTPromiseResolveBlock)resolve reject:(RCTPromiseRejectBlock)reject {
    NSNumber *result = @([CheckNotificationPermission checkNotificationPermission]);
    resolve(result);
//    NSError *error = nil;
//    reject(@"Loi", @"Loi 22", error  );
}

- (void)goToNotificationSetting {
    [CheckNotificationPermission goToNotificationSetting];
}



@end
