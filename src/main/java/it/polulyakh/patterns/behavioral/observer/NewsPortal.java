package it.polulyakh.patterns.behavioral.observer;




import java.util.*;

public class NewsPortal {

    private final  List<Channel> channels = new ArrayList<Channel>();
    private String news;

    public void add(Channel channel) {
        channels.add(channel);
    }
    public void remove(Channel channel) {
        channels.remove(channel);
    }

    public void sendNews(String news) {
        this.news = news;
        channels.forEach(channel -> channel.update(news));
    }
}
