package com.k7;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Point {
    private int pointX;
    private int pointY;

    public int distanceTo(Point p) {
        double distance = (Math.pow((p.getPointX() - pointX), 2)) +
                (Math.pow((p.getPointY() - pointY), 2));
        return (int) Math.round(distance);

    }

}
