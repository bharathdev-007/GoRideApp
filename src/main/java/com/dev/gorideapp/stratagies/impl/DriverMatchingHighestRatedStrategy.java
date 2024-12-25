package com.dev.gorideapp.stratagies.impl;

import com.dev.gorideapp.dto.RideRequestDto;
import com.dev.gorideapp.entities.Driver;
import com.dev.gorideapp.entities.RideRequest;
import com.dev.gorideapp.stratagies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class DriverMatchingHighestRatedStrategy implements DriverMatchingStrategy {

    @Override
    public List<Driver> findMatchingDrivers(RideRequest rideRequest) {
        return null;
    }
}
