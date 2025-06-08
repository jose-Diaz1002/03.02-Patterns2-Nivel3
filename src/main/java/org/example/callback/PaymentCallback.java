package org.example.callback;

public interface PaymentCallback {

    void onSuccess(String message);

    void onFailure(String error);
}
