package it.polulyakh.patterns.creational.singleton;

//Простой одиночка, но не потокобезопасный
public class SimpleSingleton {
    private static SimpleSingleton instance;

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }
}
