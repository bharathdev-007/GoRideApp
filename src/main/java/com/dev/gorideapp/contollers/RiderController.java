package com.dev.gorideapp.contollers;

import com.dev.gorideapp.dto.RideRequestDto;
import com.dev.gorideapp.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rider")
@RequiredArgsConstructor
public class RiderController {

    private final RiderService riderService;



    public ResponseEntity<RideRequestDto> requestRide(@RequestBody  RideRequestDto rideRequestDto) {

        return ResponseEntity.ok(riderService.requestRide(rideRequestDto));
    }
}
