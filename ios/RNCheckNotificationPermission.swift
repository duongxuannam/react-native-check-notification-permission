//
//  NotificationPermission.swift
//  RNCheckNotificationPermission
//
//  Created by Nam Duong on 6/24/19.
//  Copyright © 2019 Facebook. All rights reserved.
//

import Foundation
import UIKit

@objc(RNCheckNotificationPermission)
class RNCheckNotificationPermission: NSObject {
    
    @objc
    func checkNotificationPermission(_ resolve: @escaping RCTPromiseResolveBlock,
                                     rejecter reject: @escaping RCTPromiseRejectBlock) {
        let notificationType = UIApplication.shared.currentUserNotificationSettings!.types
        if notificationType == [] {
            resolve(false)
            
        } else {
            resolve(true)
            
        }
        
    }
    
    @objc
    func changeNotificationSetting() {
        if #available(iOS 10.0, *) {
            UIApplication.shared.open( URL(string:UIApplication.openSettingsURLString)!, options: [:], completionHandler: nil)
        } else {
            // Fallback on earlier versions
        }
    }
    
    
    @objc
    static func requiresMainQueueSetup() -> Bool {
        return true
    }
}
