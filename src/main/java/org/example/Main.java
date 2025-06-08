package org.example;

import org.example.callback.BankDebitPayment;
import org.example.callback.CreditCardPayment;
import org.example.callback.PaypalPayment;
import org.example.callback.ShoesStore;

public class Main {
    public static void main(String[] args) {

        ShoesStore store = new ShoesStore();

        System.out.println("=== Credit Card Checkout ===");
        store.checkout(new CreditCardPayment());

        System.out.println("\n=== Paypal Checkout ===");
        store.checkout(new PaypalPayment());

        System.out.println("\n=== Bank Debit Checkout ===");
        store.checkout(new BankDebitPayment());

    }
}