package it.polulyakh.patterns.creational.singleton;


/**
 * Плюсы:
 * Ленивая инициализация
 * Потокобезопасность.
 * Высокая производительность в многопоточной среде.
 * Минусы:
 * Для корректной работы необходима гарантия, что объект класса Singleton инициализируется без ошибок.
 * Иначе первый вызов метода getInstance закончится ошибкой ExceptionInInitializerError, а все последующие NoClassDefFoundError.
 */
public class HolderSingleton {
    private HolderSingleton(){
    }

    private static class Holder{
       private static final HolderSingleton INSTANCE = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
