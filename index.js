
import { NativeModules } from 'react-native';

const {RNCheckNotificationPermission:{goNotificationSetting,checkNotificationPermission}} = NativeModules

export  {goNotificationSetting,checkNotificationPermission};
