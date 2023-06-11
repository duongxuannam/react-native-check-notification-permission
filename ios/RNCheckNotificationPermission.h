#import <Foundation/Foundation.h>

#ifdef RCT_NEW_ARCH_ENABLED

#import <RNCheckNotificationPermissionSpec/RNCheckNotificationPermissionSpec.h>
@interface RNCheckNotificationPermission: NSObject <NativeModuleSpec>

#else

#import <React/RCTBridgeModule.h>
@interface RNCheckNotificationPermission : NSObject <RCTBridgeModule>

#endif

@end