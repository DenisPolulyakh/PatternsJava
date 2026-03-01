package it.polulyakh.patterns.deepseek.structured.decorator;

public abstract class ToppingDecorator implements Pizza {
    protected Pizza wrappedPizza;

    public ToppingDecorator(Pizza pizza) {
        wrappedPizza = pizza;
    }

    @Override
    public double getCost() {
        return wrappedPizza.getCost();
    }

    @Override
    public String getDescription() {
        return wrappedPizza.getDescription();
    }

}
