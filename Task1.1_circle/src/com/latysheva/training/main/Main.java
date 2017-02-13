package com.latysheva.training.main;

import com.latysheva.training.figure.Circle;
import com.latysheva.training.figure.Perimeter;
import com.latysheva.training.common.ConsoleInputOutput;
import com.latysheva.training.figure.Square;


public class Main {

    public static void main(String[] args) {
        // write your code here
        ConsoleInputOutput cOutPut = new ConsoleInputOutput();
        Circle cParam = new Circle();
        cOutPut.printRadiusValue(cParam);
        Perimeter prmtr = new Perimeter();
        prmtr.printCirclePerimeter(cParam);
        Square sqr = new Square();
        sqr.printCircleSquare(cParam);

    }
}