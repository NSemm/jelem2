package com.k7;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle {
    private Point center;
    private int radius;
    //private PointStorage pointStorage;


    public boolean pointInCircle(Point p) {
        return (center.distanceTo(p) <= radius);
    }
}
