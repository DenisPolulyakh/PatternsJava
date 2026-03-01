package it.polulyakh.patterns.deepseek.structured.decorator;

public class PepperoniTopping extends ToppingDecorator {
    public PepperoniTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 70;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" + \uD83E\uDD53 Пепперони";
    }

}
