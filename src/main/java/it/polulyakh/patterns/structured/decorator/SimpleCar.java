package it.polulyakh.patterns.structured.decorator;

public class SimpleCar implements Car {
    private int speed = 100;
    @Override
    public int getSpeed() {
        return speed;
    }
}
