package it.polulyakh.patterns.creational.singleton;

public class ThreadSafeClassicSingleton {
    public static volatile ThreadSafeClassicSingleton instance;

    private ThreadSafeClassicSingleton() {}

    public static ThreadSafeClassicSingleton getInstance() {
        ThreadSafeClassicSingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (ThreadSafeClassicSingleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new ThreadSafeClassicSingleton();
                }
            }
        }
        return localInstance;
    }
}
