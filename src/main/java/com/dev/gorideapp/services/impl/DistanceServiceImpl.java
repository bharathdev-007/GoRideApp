package com.dev.gorideapp.services.impl;

import com.dev.gorideapp.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceImpl implements DistanceService {

    @Override
    public double calculateDistance(Point src, Point dst) {
        return 0;
    }
}
