package com.dev.gorideapp.services.impl;

import com.dev.gorideapp.dto.DriverDto;
import com.dev.gorideapp.dto.RideDto;
import com.dev.gorideapp.services.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto endRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto raetRider(Long rideId) {
        return null;
    }

    @Override
    public RideDto acceptRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getMyRides() {
        return null;
    }
}
