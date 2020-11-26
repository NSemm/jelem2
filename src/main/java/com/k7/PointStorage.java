package com.k7;

import java.util.Arrays;

public class PointStorage {
    private Point[] points = new Point[0];

    public Point[] getAllPoint() {
        return points;
    }

    public Point getPoint(int i) {
        checkIndex(i);
        return points[i];
    }

    public void setPoint(int i, Point p) {
        checkIndex(i);
        this.points[i] = p;
    }

    public void addPoint(Point point) {
        points = Arrays.copyOf(points, points.length + 1);
        points[points.length - 1] = point;
    }

    public void removePoint(int i) {
        checkIndex(i);
        Point[] temp = new Point[points.length - 1];
        for (int j = 0; j < temp.length; j++) {
            temp[j] = points[j < i ? j : j + 1];
        }
        points = temp;
    }
    public void checkIndex (int i){
        if (i>= points.length||i<0)
            throw new IndexOutOfBoundsException();
    }
    public int size (){
        return points.length;
    }
}
