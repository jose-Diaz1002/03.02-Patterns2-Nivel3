package org.example;

import org.example.callback.BankDebitPayment;
import org.example.callback.CreditCardPayment;
import org.example.callback.PaypalPayment;
import org.example.callback.ShoesStore;

public class Main {
    public static void main(String[] args) {

        ShoesStore store = new ShoesStore();


        store.checkout(new CreditCardPayment());

        System.out.println("\n--------------------");
        store.checkout(new PaypalPayment());

        System.out.println("\n-------------------");
        store.checkout(new BankDebitPayment());

    }
}