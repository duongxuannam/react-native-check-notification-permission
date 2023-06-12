
# react-native-check-notification-permission

## Demo 

### iOS

![](https://media.giphy.com/media/MZ9IFFwKaIKr8ujd7w/giphy.gif)

### Android
![](https://media.giphy.com/media/d5Z8krBVjda7kpn7U7/giphy.gif)

### Getting started

The new version support both old and new architecture. Easy example to writing native module support both architectures. Old version is on branch [old-architecture](https://github.com/duongxuannam/react-native-check-notification-permission/tree/nam.duong/old-architecture)

`$ npm install react-native-check-notification-permission --save`

#### Setting to run in old architecture mode 
#### android 
open ``android/gradle.properties`` and update newArchEnabled equal false

``
newArchEnabled=false
``
#### ios

``cd ios && bundle install && bundle exec pod install 
``


#### Setting to run in new architecture mode 

#### ios
``cd ios && bundle install && RCT_NEW_ARCH_ENABLED=1 bundle exec pod install 
``
#### android 
open ``android/gradle.properties`` and update newArchEnabled equal true
``
newArchEnabled=true
``
## Usage
```javascript
import {goToNotificationSetting,checkNotificationPermission} from 'react-native-check-notification-permission';

function(){
	...
	const bool = await checkNotificationPermission();
	goToNotificationSetting();
    ...
}
```

## Properties


| Prop   | Type | Result | Description |
| :------------ |:---------------:| :---------------:| :-----|
| checkNotificationPermission  | `func` |`bool` |Get status notification permission. Return `true` if allowed and false if deny
| goToNotificationSetting  | `func` | `void`|Navigate to setting notification screen |
  
