package com.k7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PointStorage {
    private Point[] points = new Point[0];

    public Point[] getAllPoint(){
        return points;
    }

    public void addPoint (Point point){
        points = Arrays.copyOf(points, points.length+1);
        points[points.length-1] = point;
    }
}
