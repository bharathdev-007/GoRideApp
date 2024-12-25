package com.dev.gorideapp.services;

import com.dev.gorideapp.dto.DriverDto;
import com.dev.gorideapp.dto.RideDto;
import com.dev.gorideapp.dto.RideRequestDto;
import com.dev.gorideapp.dto.RiderDto;
import com.dev.gorideapp.entities.Rider;
import com.dev.gorideapp.entities.User;

import java.util.List;

public interface RiderService {
    RideRequestDto requestRide(RideRequestDto rideRequestDto);
    RideDto cancelRide(Long rideId);
    DriverDto rateDriver(Long rideId);
    RiderDto getMyProfile();
    List<RideDto> getMyRides();
    Rider createNewRider(User user);
}
