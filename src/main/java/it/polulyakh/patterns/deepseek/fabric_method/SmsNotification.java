package it.polulyakh.patterns.deepseek.fabric_method;

public class SmsNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Отправка SMS на номер +7XXX: " + message);
    }
}
