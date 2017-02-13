package com.latysheva.training.figure;


public class Circle {
    private double radius; // figure radius

    public Circle(Double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    private void setRadius(double r) {
        radius = r;
    }
}
