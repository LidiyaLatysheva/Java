package com.latysheva.training.main;

import com.latysheva.training.figure.Circle;
import com.latysheva.training.figure.Perimeter;
import com.latysheva.training.common.ConsoleInputOutput;
import com.latysheva.training.figure.Square;


public class Main {

    public static void main(String[] args) {
        // write your code here
        ConsoleInputOutput inputOutput = new ConsoleInputOutput();

        Double radius = inputOutput.inputDoubleValue();
        Circle cParam = new Circle(radius);
        inputOutput.printRadiusValue(cParam);
        Perimeter prmtr = new Perimeter();
        prmtr.printCirclePerimeter(cParam);
        Square sqr = new Square();
        sqr.printCircleSquare(cParam);

    }
}