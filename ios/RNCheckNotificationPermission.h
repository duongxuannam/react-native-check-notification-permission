#import <Foundation/Foundation.h>

#ifdef RCT_NEW_ARCH_ENABLED

#import <RNCheckNotificationPermissionSpec/RNCheckNotificationPermissionSpec.h>
@interface RNCheckNotificationPermission: NSObject <NativeCheckNotificationSpec>

#else

#import <React/RCTBridgeModule.h>
@interface RNCheckNotificationPermission : NSObject <RCTBridgeModule>

#endif

@end