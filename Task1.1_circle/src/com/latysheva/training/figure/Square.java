package com.latysheva.training.figure;

import static java.lang.Math.PI;

/**
 * Created by Lidziya_Latyshava on 2/7/2017.
 */
public class Square {

    private double calculateCircleSquare (double radius){
        double square; //calculated square

        square = PI*radius*radius;

        return square;
    }

    public void printCircleSquare(Circle circle){
        double square = calculateCircleSquare(circle.getRadius());
        System.out.println("Calculated square is: " + square);
    }

}
