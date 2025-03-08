package it.polulyakh.patterns.creational.prototype;

public class Human implements Cloneable{
    private String name;
    private int age;
    private Passport passport;

    public Human(String name, int age, Passport passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Passport getPassport() {
        return passport;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", passport=" + passport +
                '}';
    }


    public Human clone() throws CloneNotSupportedException {
        Human human = (Human) super.clone();
        human.passport = (Passport) passport.clone();
        return human;
    }
}
