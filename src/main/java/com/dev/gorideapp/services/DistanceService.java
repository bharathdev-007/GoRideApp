package com.dev.gorideapp.services;


import org.locationtech.jts.geom.Point;

public interface DistanceService {
    double calculateDistance(Point src, Point dst);

}
