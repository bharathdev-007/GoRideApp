package com.dev.gorideapp.stratagies;

import com.dev.gorideapp.entities.Payment;

public interface PaymentStrategy {
    Double PLATFORM_COMMISSION = 0.3;

    void processPayment(Payment payment);
}