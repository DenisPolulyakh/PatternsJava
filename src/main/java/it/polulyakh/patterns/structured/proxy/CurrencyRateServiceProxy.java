package it.polulyakh.patterns.structured.proxy;

import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

//Кеширующий прокси
public class CurrencyRateServiceProxy implements CurrencyRateService {
    private final CurrencyRateService currencyRateService;
    Map<Currency, Double>  currencyMap = new HashMap<>();

    public CurrencyRateServiceProxy() {
        this.currencyRateService = new CurrencyRateServiceImpl();
    }

    @Override
    public double getDailyCurrencyRate(Currency currency) {
        if(currencyMap.containsKey(currency)) {
            return currencyMap.get(currency);
        }
        double dailyCurrencyRate = currencyRateService.getDailyCurrencyRate(currency);
        currencyMap.put(currency, dailyCurrencyRate);
        return dailyCurrencyRate;
    }
}
