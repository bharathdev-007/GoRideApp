package com.dev.gorideapp.services;

import com.dev.gorideapp.dto.DriverDto;
import com.dev.gorideapp.dto.RideDto;

import java.util.List;

public interface DriverService {

     RideDto cancelRide(Long rideId);
     RideDto startRide(Long rideId);
     RideDto endRide(Long rideId);
     RideDto raetRider(Long rideId);
     RideDto acceptRide(Long rideId, Integer rating);
     DriverDto getMyProfile();
     List<RideDto> getMyRides();


}
