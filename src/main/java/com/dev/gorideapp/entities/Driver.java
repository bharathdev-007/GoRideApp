package com.dev.gorideapp.entities;

import jakarta.persistence.*;
import org.locationtech.jts.geom.Point;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private Double rating;

    private Boolean available;
    @Column(columnDefinition = "Geometry(Point, 4326)")
    Point currentLocation;
}
