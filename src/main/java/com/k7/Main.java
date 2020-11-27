package com.k7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PointStorage pointStorage = new PointStorage();
        ControlsOfObjects control = new ControlsOfObjects(pointStorage);
        //control.enterPoint();
        //control.CircleCount();
        pointStorage.addPointOptimized(new Point(5, 3));
        pointStorage.addPointOptimized(new Point(-1, 7));
        pointStorage.addPointOptimized(new Point(-2, 1));
        pointStorage.addPointOptimized(new Point(-4, -4));
        pointStorage.addPointOptimized(new Point(3, 4));
        pointStorage.addPointOptimized(new Point(-2, 1));
        pointStorage.addPointOptimized(new Point(-4, -4));
        pointStorage.addPointOptimized(new Point(3, 4));
        pointStorage.addPointOptimized(new Point(-2, 1));
        pointStorage.addPointOptimized(new Point(-4, -4));
        pointStorage.addPointOptimized(new Point(3, 4));

        pointStorage.getAllPoint();
        System.out.println("pointStorage.size:"+pointStorage.size());
        System.out.println("pointStorage.sizeReserve:"+pointStorage.sizeReserve());
        pointStorage.removePoint(2);
        pointStorage.removePoint(2);
        pointStorage.removePoint(2);
        pointStorage.removePoint(2);
        pointStorage.removePoint(2);
        pointStorage.removePoint(2);
        pointStorage.removePoint(2);
        pointStorage.removePoint(2);
        pointStorage.getAllPoint();
        System.out.println("pointStorage.size:"+pointStorage.size());
        System.out.println("pointStorage.sizeReserve:"+pointStorage.sizeReserve());
        pointStorage.setPoint(1, new Point(-2,-5));
        pointStorage.getAllPoint();
        System.out.println("pointStorage.size:"+pointStorage.size());
        System.out.println("pointStorage.sizeReserve:"+pointStorage.sizeReserve());
    }
}
