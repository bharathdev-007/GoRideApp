package com.dev.gorideapp.dto;

import lombok.Data;

@Data
public class PointDto {
    private double[] coordinates;
    private String type = "Point";

    public PointDto(double[] coordinates) {
        this.coordinates = coordinates;
    }
}
