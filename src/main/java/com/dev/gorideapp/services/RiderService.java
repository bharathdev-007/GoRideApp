package com.dev.gorideapp.services;

import com.dev.gorideapp.dto.DriverDto;
import com.dev.gorideapp.dto.RideDto;
import com.dev.gorideapp.dto.RideRequestDto;
import com.dev.gorideapp.dto.RiderDto;
import com.dev.gorideapp.entities.Ride;
import com.dev.gorideapp.entities.Rider;
import com.dev.gorideapp.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface RiderService {
    RideRequestDto requestRide(RideRequestDto rideRequestDto);
    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    Page<RideDto> getAllMyRides(PageRequest pageRequest);

    Rider createNewRider(User user);

    Rider getCurrentRider();
}
