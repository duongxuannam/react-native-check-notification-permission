
# react-native-check-notification-permission

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

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNCheckNotificationPermission.sln` in `node_modules/react-native-check-notification-permission/windows/RNCheckNotificationPermission.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Check.Notification.Permission.RNCheckNotificationPermission;` to the usings at the top of the file
  - Add `new RNCheckNotificationPermissionPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNCheckNotificationPermission from 'react-native-check-notification-permission';

// TODO: What to do with the module?
RNCheckNotificationPermission;
```
  