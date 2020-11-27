package com.k7;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return pointX == point.pointX &&
                pointY == point.pointY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    @Override
    public String toString() {
        return "Point (" +pointX +"  "+ pointY +")";
    }
}
