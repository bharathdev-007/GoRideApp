package com.dev.gorideapp.stratagies.impl;

import com.dev.gorideapp.dto.RideRequestDto;
import com.dev.gorideapp.entities.RideRequest;
import com.dev.gorideapp.stratagies.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequest rideRequest) {
        return 0;
    }
}
