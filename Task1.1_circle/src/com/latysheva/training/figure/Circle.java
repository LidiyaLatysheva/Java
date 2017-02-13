package com.latysheva.training.figure;


import com.latysheva.training.common.ConsoleInputOutput;


public class Circle {
    private double radius; // figure radius

    public Circle() {
        System.out.print("Radius value is not set. ");
        ConsoleInputOutput consoleInput = new ConsoleInputOutput();
        setRadius(consoleInput.inputDoubleValue());
    }

    public double getRadius() {
        return radius;
    }

    private void setRadius(double r) {
        radius = r;
    }
}
