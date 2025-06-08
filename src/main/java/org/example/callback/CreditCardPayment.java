package org.example.callback;

public class CreditCardPayment implements PaymentMethodo {
    @Override
    public void pay(PaymentCallback callback) {
        callback.onSuccess("Credit Card payment successful");
    }
}
