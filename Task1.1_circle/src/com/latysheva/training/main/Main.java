package com.latysheva.training.main;

import com.latysheva.training.figure.Circle;
import com.latysheva.training.figure.Perimeter;
import com.latysheva.training.common.ConsoleInputOutput;
import com.latysheva.training.figure.Square;
//import com.latysheva.training.multiplication.MathActionOnNumber;
//import com.latysheva.training.multiplication.Number;


/**
 * Created by Lidziya_Latyshava on 2/7/2017.
 */

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

        /*Number nmb = new Number();
        MathActionOnNumber mult = new MathActionOnNumber();
        System.out.println("Calculated multiplication of number digits is: " + mult.multiplication4DigitsOfInteger(nmb.getNumber()));*/
   }
}