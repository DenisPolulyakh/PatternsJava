package it.polulyakh.patterns.creational.fabric_method;

class DollarCreator implements CreatorCurrency {
    @Override
    public Currency createCurrency() {
        return new Dollar();
    }
}
