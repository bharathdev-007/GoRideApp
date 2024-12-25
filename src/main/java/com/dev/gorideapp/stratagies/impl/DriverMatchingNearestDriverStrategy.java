package com.dev.gorideapp.stratagies.impl;

import com.dev.gorideapp.dto.RideRequestDto;
import com.dev.gorideapp.entities.Driver;
import com.dev.gorideapp.entities.RideRequest;
import com.dev.gorideapp.repositories.DriverRepository;
import com.dev.gorideapp.stratagies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDrivers(RideRequest rideRequest) {
        return driverRepository.findTenNearestDrivers(rideRequest.getPickupLocation());
    }
}
