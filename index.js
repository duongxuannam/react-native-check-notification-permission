
import { NativeModules } from 'react-native';

const {RNCheckNotificationPermission:{changeNotificationSetting,checkNotificationPermission}} = NativeModules

export  {changeNotificationSetting,checkNotificationPermission};
