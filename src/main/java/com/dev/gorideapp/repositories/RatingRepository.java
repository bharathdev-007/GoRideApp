package com.dev.gorideapp.repositories;

import com.dev.gorideapp.entities.Driver;
import com.dev.gorideapp.entities.Rating;
import com.dev.gorideapp.entities.Ride;
import com.dev.gorideapp.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findByRider(Rider rider);
    List<Rating> findByDriver(Driver driver);

    Optional<Rating> findByRide(Ride ride);
}
