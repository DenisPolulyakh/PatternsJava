package it.polulyakh.patterns.deepseek.fabric_method;

//Создатель
public abstract class NotificationFactory {
    public abstract Notification createNotification();

    public void notify(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}
