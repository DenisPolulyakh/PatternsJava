package it.polulyakh.patterns.structured.bridge;

public abstract class Shape {
   protected final Color color;

   public Shape(Color color) {
      this.color = color;
   }

   abstract String draw();
}
