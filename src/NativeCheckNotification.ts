import type {TurboModule} from 'react-native/Libraries/TurboModule/RCTExport';
import {TurboModuleRegistry} from 'react-native';

export interface Spec extends TurboModule {
  add(a: number, b: number): Promise<number>;
  checkNotificationPermission(): Promise<number>;
  goToNotificationSetting(): void;
}

export default TurboModuleRegistry.get<Spec>(
  'RNCheckNotificationPermission',
) as Spec | null;