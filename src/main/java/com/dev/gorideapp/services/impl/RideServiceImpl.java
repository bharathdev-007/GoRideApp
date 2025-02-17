package com.dev.gorideapp.services.impl;

import com.dev.gorideapp.dto.RideRequestDto;
import com.dev.gorideapp.entities.Driver;
import com.dev.gorideapp.entities.Ride;
import com.dev.gorideapp.entities.RideRequest;
import com.dev.gorideapp.entities.Rider;
import com.dev.gorideapp.entities.enums.RideRequestStatus;
import com.dev.gorideapp.entities.enums.RideStatus;
import com.dev.gorideapp.exceptions.ResourceNotFoundException;
import com.dev.gorideapp.repositories.RideRepository;
import com.dev.gorideapp.services.RideRequestService;
import com.dev.gorideapp.services.RideService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class RideServiceImpl implements RideService {
    private final RideRepository rideRepository;
    private final RideRequestService rideRequestService;
    private final ModelMapper modelMapper;

    @Override
    public Ride getRideById(Long rideId) {
        return rideRepository.findById(rideId)
                .orElseThrow(() -> new ResourceNotFoundException("Ride not found with id: "+rideId));
    }

    @Override
    public Ride createNewRide(RideRequest rideRequest, Driver driver) {
        rideRequest.setRideRequestStatus(RideRequestStatus.CONFIRMED);

        Ride ride = modelMapper.map(rideRequest, Ride.class);
        ride.setRideStatus(RideStatus.CONFIRMED);
        ride.setDriver(driver);
        ride.setOtp(generateRandomOTP());
        ride.setId(null);

        rideRequestService.update(rideRequest);
        return rideRepository.save(ride);
    }


    @Override
    public Ride updateRideStatus(Ride ride, RideStatus rideStatus) {
        ride.setRideStatus(rideStatus);
        return rideRepository.save(ride);
    }

    @Override
    public Page<Ride> getAllRidesOfRider(Rider rider, PageRequest pageRequest) {

        return rideRepository.findByRider(rider, pageRequest);
    }

    @Override
    public Page<Ride> getAllRidesOfDriver(Driver driver, PageRequest pageRequest) {

        return rideRepository.findByDriver(driver, pageRequest);
    }

    private String generateRandomOTP() {
        Random random = new Random();
        int otpInt = random.nextInt(10000);  //0 to 9999
        return String.format("%04d", otpInt);
    }
}
