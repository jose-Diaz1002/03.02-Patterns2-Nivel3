package org.example.callback;

public class BankDebitPayment implements PaymentMethodo {

    @Override
    public void pay(PaymentCallback callback) {
        callback.onFailure("Bank account has insufficient funds.");
    }
}
