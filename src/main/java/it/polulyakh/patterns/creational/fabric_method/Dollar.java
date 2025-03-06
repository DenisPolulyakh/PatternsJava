package it.polulyakh.patterns.creational.fabric_method;

class Dollar implements Currency {

    @Override
    public String getCurrencySymbol() {
        return "USD";
    }
}
