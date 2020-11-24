package com.k7;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle {
    private int centerX;
    private int centerY;
    private int radius;
    private PointStorage pointStorage;


    public void pointsInCircle(){
        for (int i = 0; i < pointStorage.getAllPoint().length; i++) {
            if (((Math.pow((pointStorage.getAllPoint()[i].getPointX() - centerX), 2)) +
                    (Math.pow((pointStorage.getAllPoint()[i].getPointY() - centerY), 2)))
                    <= Math.pow(radius, 2))
                System.out.println("Point " + (i+1) + " belongs this circle");
        }
    }
}
