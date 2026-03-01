package it.polulyakh.patterns.deepseek.fabric_method;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }

}
