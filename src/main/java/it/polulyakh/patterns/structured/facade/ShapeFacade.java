package it.polulyakh.patterns.structured.facade;



public class ShapeFacade {
    private final Triangle triangle;
    private final Rectangle rectangle;
    private final Circle circle;

    public ShapeFacade() {
        this.triangle = new Triangle();
        this.rectangle = new Rectangle();
        this.circle = new Circle();
    }

    public String draw(String shape){
        switch(shape.toLowerCase()){
            case "triangle": return triangle.draw();
            case "rectangle": return rectangle.draw();
            case "circle": return circle.draw();
            default: return "Unknown shape";
        }
    }
}
