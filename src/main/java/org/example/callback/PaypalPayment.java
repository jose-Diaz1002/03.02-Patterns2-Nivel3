package org.example.callback;

public class PaypalPayment implements PaymentMethodo {

    @Override
    public void pay(PaymentCallback callback) {
        callback.onSuccess("Paypal payment successful.");
    }

}
