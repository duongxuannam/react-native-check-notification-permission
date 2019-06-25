
# react-native-check-notification-permission

## Demo 

### iOS

![](ios.gif){:height="50%" width="50%"}

### Android

![](https://i.imgur.com/SfjrjTP.gif){:height="50%" width="50%"}
## Getting started

`$ npm install react-native-check-notification-permission --save`

### Mostly automatic installation

`$ react-native link react-native-check-notification-permission`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-check-notification-permission` and add `RNCheckNotificationPermission.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNCheckNotificationPermission.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

###### Note
   Because library written in Swift you need to add this `$(TOOLCHAIN_DIR)/usr/lib/swift/$(PLATFORM_NAME)` to the library search paths of your target.
   You also set `Always Embed Swift Standard Libraries` to `Yes` under your `Build Settings > Build Options` 

<img style="float: left" alt="react-native-swiper" src="https://i.imgur.com/THTKAEk.png" width="500"> 

<br/>

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNCheckNotificationPermissionPackage;` to the imports at the top of the file
  - Add `new RNCheckNotificationPermissionPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-check-notification-permission'
  	project(':react-native-check-notification-permission').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-check-notification-permission/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-check-notification-permission')
  	```

## Usage
```javascript
import {changeNotificationSetting,checkNotificationPermission} from 'react-native-check-notification-permission';

function(){
	...
	const bool = await checkNotificationPermission();
	changeNotificationSetting();
    ...
}
```

## Properties


| Prop   | Type | Result | Description |
| :------------ |:---------------:| :---------------:| :-----| :---------------:|
| checkNotificationPermission  | `func` |`bool` |Get status notification permission. Return `true` if allowed and false if deny
| changeNotificationSetting  | `func` | `void`|Navigate to setting notification screen |
  
