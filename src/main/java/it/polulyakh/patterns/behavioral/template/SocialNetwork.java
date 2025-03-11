package it.polulyakh.patterns.behavioral.template;

public abstract class SocialNetwork {

    private final String login;
    private final String password;

    protected SocialNetwork(String login, String password) {
        this.login = login;
        this.password = password;
    }

    //Шаблонный метод
    public void createPost(String message) {
        boolean loginSuccess = login(login, password);
        if (loginSuccess) {
            publish(message);
            logout();
        }
    }

    abstract boolean login(String login, String password);

    abstract void logout();

    abstract void publish(String message);
}
