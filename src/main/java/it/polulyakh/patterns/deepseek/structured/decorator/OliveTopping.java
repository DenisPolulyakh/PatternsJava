package it.polulyakh.patterns.deepseek.structured.decorator;

public class OliveTopping extends ToppingDecorator {
    public OliveTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" + \uD83E\uDED2 Оливки";
    }

}
