package com.dev.gorideapp.dto;

import com.dev.gorideapp.entities.Rider;
import com.dev.gorideapp.entities.enums.PaymentMethod;
import com.dev.gorideapp.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDto {

    private long id;

    private Point pickupLocation;
    private Point dropOffLocation;

    private LocalDateTime requestedTime;
    private Rider rider;
    private PaymentMethod paymentMethod;
    private RideRequestStatus rideRequestStatus;

}
