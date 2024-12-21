package com.dev.gorideapp.dto;


import com.dev.gorideapp.entities.enums.PaymentMethod;
import com.dev.gorideapp.entities.enums.RideStatus;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDto {
    private long id;

    private Point pickupLocation;
    private Point dropOffLocation;

    private LocalDateTime requestedTime;

    private RiderDto rider;

    private DriverDto driver;

    private PaymentMethod paymentMethod;

    private RideStatus rideRequestStatus;

    private Double fare;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
