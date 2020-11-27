package com.k7;

import java.util.Arrays;

public class PointStorage {
    private Point[] points = new Point[4];
    private int indexArray = 0;

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

    public void addPointOptimized(Point point) {
        if (indexArray == points.length - 1) pointArrayResize();
        points[indexArray] = point;
        indexArray++;
    }

    private void pointArrayResize() {
        double factor = points.length * 1.5;
        points = Arrays.copyOf(points, (int) Math.round(factor));
    }

    public void removePoint(int i) {
        checkIndex(i);
        Point[] temp = new Point[points.length];
        for (int j = 0; j < indexArray - 1; j++) {
            temp[j] = points[j < i ? j : j + 1];
        }
        points = temp;
        indexArray--;
    }

    public void checkIndex(int i) {
        if (i >= indexArray || i < 0)
            throw new IndexOutOfBoundsException();
    }

    public int sizeReserve() {
        return points.length;
    }

    public int size() {
        return indexArray;
    }
}
