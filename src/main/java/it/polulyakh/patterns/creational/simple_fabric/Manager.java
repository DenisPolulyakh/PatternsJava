package it.polulyakh.patterns.creational.simple_fabric;

public class Manager extends Employee{
    @Override
    public void work() {
        System.out.println("Я менеджер. У кого нет задач?");
    }
}
