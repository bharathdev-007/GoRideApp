package com.dev.gorideapp.stratagies.impl;

import com.dev.gorideapp.dto.RideRequestDto;
import com.dev.gorideapp.entities.RideRequest;
import com.dev.gorideapp.services.DistanceService;
import com.dev.gorideapp.stratagies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
//@Service
public class RiderFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {

    private final DistanceService distanceService;

    @Override
    public double calculateFare(RideRequest rideRequest) {
        double distance = distanceService.calculateDistance(rideRequest.getPickupLocation(),
                rideRequest.getDropOffLocation());
        return distance*RIDE_FARE_MULTIPLIER;
    }
}
