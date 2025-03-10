package it.polulyakh.patterns.structured.proxy;

import java.rmi.MarshalException;
import java.util.Currency;

public class CurrencyRateServiceImpl implements CurrencyRateService {
    @Override
    public double getDailyCurrencyRate(Currency currency) {
        double rate = 100*Math.random();
        double scale = Math.pow(10,2);
        //2 знака после запятой
        return Math.round(rate * scale)/scale;
    }
}
