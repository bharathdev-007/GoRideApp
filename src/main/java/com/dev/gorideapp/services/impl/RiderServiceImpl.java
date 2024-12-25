package com.dev.gorideapp.services.impl;

import com.dev.gorideapp.dto.DriverDto;
import com.dev.gorideapp.dto.RideDto;
import com.dev.gorideapp.dto.RideRequestDto;
import com.dev.gorideapp.dto.RiderDto;
import com.dev.gorideapp.entities.RideRequest;
import com.dev.gorideapp.entities.Rider;
import com.dev.gorideapp.entities.User;
import com.dev.gorideapp.entities.enums.RideRequestStatus;
import com.dev.gorideapp.repositories.RideRequestRepository;
import com.dev.gorideapp.repositories.RiderRepository;
import com.dev.gorideapp.services.RiderService;
import com.dev.gorideapp.stratagies.DriverMatchingStrategy;
import com.dev.gorideapp.stratagies.RideFareCalculationStrategy;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RiderServiceImpl implements RiderService {

    private final ModelMapper modelMapper;
    private final RideFareCalculationStrategy rideFareCalculationStrategy;
    private final DriverMatchingStrategy driverMatchingStrategy;
    private final RideRequestRepository rideRequestRepository;
    private final RiderRepository riderRepository;
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        RideRequest rideRequest = modelMapper.map(rideRequestDto, RideRequest.class);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);

        Double fare = rideFareCalculationStrategy.calculateFare(rideRequest);
        rideRequest.setFare(fare);

        RideRequest savedRideRequest = rideRequestRepository.save(rideRequest);

        driverMatchingStrategy.findMatchingDrivers(rideRequest);

        return modelMapper.map(savedRideRequest, RideRequestDto.class);
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getMyRides() {
        return null;
    }

    @Override
    public Rider createNewRider(User user) {
         Rider rider=Rider.
                 builder().
                 user(user).
                 rating(0.0).
                 build();
         return riderRepository.save(rider);
    }
}
