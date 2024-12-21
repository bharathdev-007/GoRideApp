package com.dev.gorideapp.stratagies;

import com.dev.gorideapp.dto.RideRequestDto;
import com.dev.gorideapp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

    public List<Driver> findMatchingDrivers(RideRequestDto rideRequestDto);
}
