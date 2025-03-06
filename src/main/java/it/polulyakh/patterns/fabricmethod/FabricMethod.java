package it.polulyakh.patterns.creational.fabric_method;

public class FabricMethod {

    public static void main(String[] args) {
        CreatorCurrency[] currencyMakers = {new RubbleCreator(), new DollarCreator(), new EuroCreator()};
        for (CreatorCurrency currencyMaker : currencyMakers) {
            System.out.println(currencyMaker.createCurrency().getCurrencySymbol());
        }

    }


}


