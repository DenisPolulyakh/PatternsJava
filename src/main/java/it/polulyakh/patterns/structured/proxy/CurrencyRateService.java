package it.polulyakh.patterns.structured.proxy;

import java.util.Currency;

public interface CurrencyRateService {
    double getDailyCurrencyRate(Currency currency);
}
