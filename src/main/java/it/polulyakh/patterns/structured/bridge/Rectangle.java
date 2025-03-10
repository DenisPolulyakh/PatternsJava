package it.polulyakh.patterns.structured.bridge;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        color.fillColor();
        return "Rectangle drawing...";
    }
}
