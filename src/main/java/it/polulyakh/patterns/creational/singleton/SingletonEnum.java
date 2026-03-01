package it.polulyakh.patterns.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public enum SingletonEnum {
    INSTANCE;

    private Map<Long, String> cached = new HashMap<Long, String>();

    public void put(final long key, final String value) {
        cached.put(key, value);
    }

    public String get(final long key) {
        return cached.get(key);
    }

    public void clear() {
        cached.clear();
    }
}
