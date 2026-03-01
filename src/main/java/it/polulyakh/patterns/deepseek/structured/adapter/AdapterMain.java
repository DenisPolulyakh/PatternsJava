package it.polulyakh.patterns.deepseek.structured.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        OldPaymentGateway oldPayment  = new OldPaymentGateway();
        PaymentAdapter adapter = new PaymentAdapter(oldPayment);

        OnlineStore onlineStore = new OnlineStore(adapter);
        onlineStore.checkout(1500);
    }
}
