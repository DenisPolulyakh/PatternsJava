package it.polulyakh.patterns.creational.builder;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    private Person(){}

    public static Builder builder() {  // Cоздается строитель
        return new Builder();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public static final class Builder { //Cтроитель по шагам строит объект person
        private Person person;

        private Builder() {
            person = new Person();
        }

        public Builder firstName(String firstName) {
            person.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            person.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            person.age = age;
            return this;
        }

        public Person build() {
            return person;  // Возвращает созданный объект
        }

    }
}
