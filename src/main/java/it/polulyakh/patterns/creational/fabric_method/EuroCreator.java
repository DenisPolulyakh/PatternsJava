package it.polulyakh.patterns.creational.fabric_method;

class EuroCreator implements CreatorCurrency {
    @Override
    public Currency createCurrency() {
        return new Euro();
    }
}
