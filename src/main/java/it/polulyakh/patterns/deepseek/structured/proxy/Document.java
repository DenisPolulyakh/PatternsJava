package it.polulyakh.patterns.deepseek.structured.proxy;

public interface Document {
    String getAccessLevel();
    void displayContent(User user);
}
