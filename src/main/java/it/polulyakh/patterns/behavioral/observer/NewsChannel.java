package it.polulyakh.patterns.behavioral.observer;

public class NewsChannel implements Channel {
    private final String channelName;

    public NewsChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void update(String message) {
        System.out.printf("Новостной канал: %s. Получена новость: %s\n", channelName, message);
    }
}
