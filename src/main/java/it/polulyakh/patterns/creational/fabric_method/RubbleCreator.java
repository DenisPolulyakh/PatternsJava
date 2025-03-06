package it.polulyakh.patterns.creational.fabric_method;

class RubbleCreator implements CreatorCurrency {

    @Override
    public Currency createCurrency() {
        return new Rubble();
    }
}
