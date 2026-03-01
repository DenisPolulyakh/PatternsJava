package it.polulyakh.patterns.deepseek.fabric_method;

public class PushNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Отправка Push-уведомления на устройство: " + message);
    }
}
