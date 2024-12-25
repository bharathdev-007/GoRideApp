package com.dev.gorideapp.stratagies;

import com.dev.gorideapp.dto.RideRequestDto;
import com.dev.gorideapp.entities.RideRequest;

public interface RideFareCalculationStrategy {
    static final double RIDE_FARE_MULTIPLIER=10;
    double calculateFare(RideRequest rideRequest);

}
