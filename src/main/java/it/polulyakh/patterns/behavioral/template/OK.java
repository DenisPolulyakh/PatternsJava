package it.polulyakh.patterns.behavioral.template;

public class OK extends SocialNetwork {
    public OK(String login, String password) {
        super(login, password);
    }

    @Override
    boolean login(String login, String password) {
        System.out.println("Успешный вход в аккаунт OK");
        return true;
    }

    @Override
    void logout() {
        System.out.println("Успешный выход из аккаунта OK");
    }

    @Override
    void publish(String message) {
        System.out.println("Опубликована новая статься OK: " + message);
    }
}
