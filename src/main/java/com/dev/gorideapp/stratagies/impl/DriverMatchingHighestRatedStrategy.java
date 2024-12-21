package com.dev.gorideapp.stratagies.impl;

import com.dev.gorideapp.dto.RideRequestDto;
import com.dev.gorideapp.entities.Driver;
import com.dev.gorideapp.stratagies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedStrategy implements DriverMatchingStrategy {

    @Override
    public List<Driver> findMatchingDrivers(RideRequestDto rideRequestDto) {
        return null;
    }
}
