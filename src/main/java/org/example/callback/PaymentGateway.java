package org.example.callback;

public class PaymentGateway {

    public void processPayment(PaymentMethodo method, PaymentCallback callback) {
        System.out.println("Processing payment...");
        method.pay(callback);
    }

}
