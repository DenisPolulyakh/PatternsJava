package it.polulyakh.patterns.creational.fabric_method;

public class FabricMethod {

    public static void main(String[] args) {
        CreatorCurrency[] currencyMakers = {new RubbleCreator(),new DollarCreator(),new EuroCreator()};
       for(CreatorCurrency currencyMaker : currencyMakers){
           System.out.println(currencyMaker.createCurrency().getCurrencySymbol());
       }

    }


}


class Rubble implements Currency {
    @Override
    public String getCurrencySymbol() {
        return "RUB";
    }
}

class Dollar implements Currency {

    @Override
    public String getCurrencySymbol() {
        return "USD";
    }
}

class Euro implements Currency {
    public String getCurrencySymbol() {
        return "EUR";
    }

}

class EuroCreator implements CreatorCurrency {
    @Override
    public Currency createCurrency() {
        return new Euro();
    }
}

class RubbleCreator implements CreatorCurrency {

    @Override
    public Currency createCurrency() {
        return new Rubble();
    }
}

class DollarCreator implements CreatorCurrency {
    @Override
    public Currency createCurrency() {
        return new Dollar();
    }
}