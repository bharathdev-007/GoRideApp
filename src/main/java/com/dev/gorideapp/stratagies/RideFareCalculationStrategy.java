package com.dev.gorideapp.stratagies;

import com.dev.gorideapp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {
    double calculateFare(RideRequestDto rideRequestDto);

}
