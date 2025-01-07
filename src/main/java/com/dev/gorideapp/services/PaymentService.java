package com.dev.gorideapp.services;

import com.dev.gorideapp.entities.Payment;
import com.dev.gorideapp.entities.Ride;
import com.dev.gorideapp.entities.enums.PaymentStatus;

public interface PaymentService {

    void processPayment(Ride ride);

    Payment createNewPayment(Ride ride);

    void updatePaymentStatus(Payment payment, PaymentStatus status);
}
