package it.polulyakh.patterns.deepseek.structured.adapter;

class OnlineStore {
    private PaymentProcessor processor;
    
    public OnlineStore(PaymentProcessor processor) {
        this.processor = processor;
    }
    
    public void checkout(double amount) {
        System.out.println("🛒 Оформляем заказ на сумму " + amount + " руб.");
        processor.pay(amount);
    }
}