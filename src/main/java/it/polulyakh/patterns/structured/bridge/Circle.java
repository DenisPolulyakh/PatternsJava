package it.polulyakh.patterns.structured.bridge;

public class Circle extends Shape {


    public Circle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        color.fillColor();
        return "Circle drawing...";

    }
}
