# Callback Pattern - Payment Gateway Simulation

This project demonstrates the use of the **Callback Pattern** to simulate a flexible and extensible payment gateway.

## 💡 Pattern Overview

The **Callback Pattern** allows a piece of code to delegate part of its behavior to a different component, invoking it back once the job is done. In Java, this is typically achieved through interfaces or lambda expressions (functional interfaces).

## 🛍️ Scenario

We simulate a **Payment Gateway** that accepts different payment methods:

- **Credit Card**
- **PayPal**
- **Bank Account Debit**

A **Shoe Store** initiates a payment request and provides a **payment method handler** (callback) to the **Payment Gateway**. The gateway processes the payment **without knowing the actual implementation** of the method, and the control returns back to the store.

This model achieves **decoupling** and enables **runtime flexibility**.

## ⚙️ Components

- **PaymentMethod (Interface)**: Declares the `pay()` method.
- **CreditCardPayment / PayPalPayment / BankDebitPayment**: Implementations of `PaymentMethod`.
- **PaymentGateway**: Accepts a `PaymentMethod` and executes the `pay()` callback.
- **ShoeStore**: The client class that creates payment methods and invokes the gateway

