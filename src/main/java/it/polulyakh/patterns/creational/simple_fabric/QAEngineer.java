package it.polulyakh.patterns.creational.simple_fabric;

public class QAEngineer extends Employee{
    @Override
    public void work() {
        System.out.println("Я тестировщик. Верну на доработку");
    }
}
