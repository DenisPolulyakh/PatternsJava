package it.polulyakh.patterns.deepseek.structured.decorator;

public class CheeseTopping extends ToppingDecorator {
    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" + \uD83E\uDDC0 Сыр";
    }

}
