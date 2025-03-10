package it.polulyakh.patterns.behavioral.chain;

public class Order {
    public Order(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    private final String id;
}
