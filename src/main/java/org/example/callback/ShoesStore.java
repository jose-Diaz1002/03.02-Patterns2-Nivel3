package org.example.callback;

public class ShoesStore {

    private final PaymentGateway gateway = new PaymentGateway();

    public void checkout(PaymentMethodo method) {
        gateway.processPayment(method, new PaymentCallback() {

            @Override
            public void onSuccess(String message) {
                System.out.println("ShoeStore: " + message);
            }

            @Override
            public void onFailure(String error) {
                System.out.println("ShoeStore: Payment failed - " + error);
            }
        });
    }
}
