package it.polulyakh.patterns.deepseek.fabric_method;

public class SmsNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
