package it.polulyakh.patterns.deepseek.fabric_method;

public class PushNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
