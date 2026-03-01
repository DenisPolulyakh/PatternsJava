package it.polulyakh.patterns.deepseek.structured.adapter;

public class PaymentAdapter implements PaymentProcessor {
    private OldPaymentGateway oldPaymentGateway;

    public PaymentAdapter(OldPaymentGateway oldPaymentGateway) {
        this.oldPaymentGateway = oldPaymentGateway;
    }

    @Override
    public void pay(double amount) {
        oldPaymentGateway.makePayment(amount);
    }
}
