package com.dev.gorideapp.services;

import com.dev.gorideapp.dto.RideRequestDto;
import com.dev.gorideapp.entities.Driver;
import com.dev.gorideapp.entities.Ride;
import com.dev.gorideapp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long id);
    void matchWithDrivers(RideRequestDto rideRequestDto);
    Ride creatwNewRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId,RideStatus status);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriveer(Long driverId, PageRequest pageRequest);


}
