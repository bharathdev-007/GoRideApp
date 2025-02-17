package com.dev.gorideapp.services;

import com.dev.gorideapp.dto.DriverDto;
import com.dev.gorideapp.dto.RiderDto;
import com.dev.gorideapp.entities.Ride;

public interface RatingService {
    DriverDto rateDriver(Ride ride, Integer rating);
    RiderDto rateRider(Ride ride, Integer rating);

    void createNewRating(Ride ride);
}
