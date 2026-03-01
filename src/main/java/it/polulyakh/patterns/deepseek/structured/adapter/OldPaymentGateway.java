package it.polulyakh.patterns.deepseek.structured.adapter;

public class OldPaymentGateway {
    public void makePayment(double amount) {
        System.out.println("💳 Старый шлюз: платеж на сумму " + amount + " руб.");
    }
}
