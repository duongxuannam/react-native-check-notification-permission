import RNCheckNotificationPermission from './src/NativeCheckNotification'

const checkNotificationPermission = async () => {
    const result = await RNCheckNotificationPermission?.checkNotificationPermission()
    return result === 1 ? true : false;
}


const goToNotificationSetting = async () => {
    await RNCheckNotificationPermission?.goToNotificationSetting()
}

export {
    goToNotificationSetting,
    checkNotificationPermission
}