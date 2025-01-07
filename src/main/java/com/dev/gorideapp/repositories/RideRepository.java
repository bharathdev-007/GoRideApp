package com.dev.gorideapp.repositories;

import com.dev.gorideapp.entities.Driver;
import com.dev.gorideapp.entities.Ride;
import com.dev.gorideapp.entities.Rider;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride,Long> {
    Page<Ride> findByRider(Rider rider, Pageable pageRequest);
    Page<Ride> findByDriver(Driver driver, Pageable pageRequest);


}
