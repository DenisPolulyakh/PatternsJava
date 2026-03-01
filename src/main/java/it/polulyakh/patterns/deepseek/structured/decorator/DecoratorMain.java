package it.polulyakh.patterns.deepseek.structured.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Pizza pizza = new MargheritaPizza();
        System.out.println(pizza.getDescription() + " = " + pizza.getCost());
        pizza = new CheeseTopping(pizza);
        System.out.println(pizza.getDescription() + " = " + pizza.getCost());
        pizza = new MashroomTopping(pizza);
        System.out.println(pizza.getDescription() + " = " + pizza.getCost());
        Pizza pizza1 = new MargheritaPizza();
        pizza1 = new CheeseTopping(pizza1);
        pizza1 = new PepperoniTopping(pizza1);
        pizza1 = new OliveTopping(pizza1);
        System.out.println(pizza1.getDescription() + " = " + pizza1.getCost());
    }
}
