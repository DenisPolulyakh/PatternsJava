package it.polulyakh.patterns.fabricmethod;

import java.util.Arrays;

public class FabricMethod {

    public static void main(String[] args) {
        CreatorCurrency[] currencyMakers = {new RubbleCreator(),new DollarCreator(),new EuroCreator()};
       for(CreatorCurrency currencyMaker : currencyMakers){
           System.out.println(currencyMaker.createCurrency().getCurrencySymbol());
       }

    }


}

/**
 * Интерфейс валюты, каждая валюта должна его реализовать
 */
interface Currency {
    String getCurrencySymbol();
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

/**
 * Интерфейс создателя, конкретный создатель должен реализовать метод
 */
interface CreatorCurrency {
    Currency createCurrency();
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