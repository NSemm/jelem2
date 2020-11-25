package com.k7;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Point {
    private int pointX;
    private int pointY;

    public double distanceTo(Point p) {
        double distance = Math.sqrt((Math.pow((p.getPointX() - pointX), 2)) +
                (Math.pow((p.getPointY() - pointY), 2)));
        return distance;

    }

}
