package com.k7;

import java.util.Scanner;

public class ControlsOfObjects {
    private PointStorage pointStorage;
    private Scanner sc = new Scanner(System.in);

    public ControlsOfObjects(PointStorage pointStorage) {
        this.pointStorage = pointStorage;
    }

    public void enterPoint() {
        System.out.println("Enter quantity of points");
        int quant = sc.nextInt();
        for (
                int i = 1;
                i <= quant; i++) {
            System.out.println("Enter X of point " + i);
            int x = sc.nextInt();
            System.out.println("Enter Y of point " + i);
            int y = sc.nextInt();
            Point point = new Point(x, y);
            pointStorage.addPoint(point);
        }
    }

    public void CircleCount() {
        System.out.println("Enter X the center of circle");
        int centerX = sc.nextInt();
        System.out.println("Enter Y the center of circle");
        int centerY = sc.nextInt();
        System.out.println("Enter radius of circle");
        int radius = sc.nextInt();
        Point center = new Point(centerX, centerY);
        Circle circle = new Circle(center, radius);
        for (
                int i = 0; i < pointStorage.getAllPoint().length; i++) {
            if (circle.pointInCircle(pointStorage.getAllPoint()[i]))
                System.out.println("Point " + (i + 1) + " belongs this circle");

        }
    }


}
