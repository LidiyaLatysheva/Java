package com.latysheva.training.figure;

import static java.lang.Math.PI;


public class Perimeter {
    private double calculateCirclePerimeter (double radius){
        double perimeter; //calculated perimeter

        perimeter = 2*PI*radius;

        return perimeter;
    }

    public void printCirclePerimeter(Circle circle){
        double perimeter = calculateCirclePerimeter(circle.getRadius());
        System.out.println("Calculated perimeter is: " + perimeter);
    }
}
