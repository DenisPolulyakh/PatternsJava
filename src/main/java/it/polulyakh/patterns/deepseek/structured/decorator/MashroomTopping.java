package it.polulyakh.patterns.deepseek.structured.decorator;

public class MashroomTopping extends ToppingDecorator {
    public MashroomTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 40;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" + \uD83C\uDF44 Грибы";
    }

}
