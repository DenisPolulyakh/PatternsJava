package it.polulyakh.patterns.deepseek.structured.proxy;

public class User {
    private String name;

    private boolean isAdmin = false;

    public User(String name, boolean isAdmin) {
        this.name = name;

        this.isAdmin = isAdmin;
    }

    public String getName() {
        return name;
    }



    public boolean isAdmin() {
        return isAdmin;
    }
}
