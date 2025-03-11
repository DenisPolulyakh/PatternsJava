package it.polulyakh.patterns.behavioral.template;

public class VK extends SocialNetwork {
    public VK(String login, String password) {
        super(login, password);
    }

    @Override
    boolean login(String login, String password) {
        System.out.println("Успешный вход в аккаунт VK");
        return true;
    }

    @Override
    void logout() {
        System.out.println("Успешный выход из аккаунта VK");
    }

    @Override
    void publish(String message) {
        System.out.println("Опубликована новая статься VK: " + message);
    }
}
