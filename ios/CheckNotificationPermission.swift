import Foundation
import UIKit

@objc
open class CheckNotificationPermission: NSObject {

  @objc
  public static func add(a: Int, b: Int) -> Int {
    return a+b;
  }

    @objc
    public static func checkNotificationPermission() -> Int {
        let notificationType = UIApplication.shared.currentUserNotificationSettings!.types
        if notificationType == [] {
            return 0
            
        } else {
            return 1
        }
    }
    
    @objc
    public static func goToNotificationSetting() -> Void {
        UIApplication.shared.open( URL(string:UIApplication.openSettingsURLString)!, options: [:], completionHandler: nil)
    }


    @objc
    static func requiresMainQueueSetup() -> Bool {
        return true
    }

}
