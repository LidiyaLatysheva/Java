package com.latysheva.training.common;

import com.latysheva.training.figure.Circle;
import static java.lang.Math.abs;

import java.util.Scanner;

/**
 * Created by Lidziya_Latyshava on 2/7/2017.
 */
public class ConsoleInputOutput {
    public double inputDoubleValue (){
        Scanner scanner = new Scanner(System.in);
        double dValue = 0;
        boolean flag = true;

        do {
            System.out.print("Enter double number: ");
            if (scanner.hasNextDouble()) {
                dValue = scanner.nextDouble();
                if (dValue < 0){
                    System.out.println("Invalid input. Value should be positive. Try again.");
                }
                else {
                    flag = false;
                }
            }
            else {
                System.out.println("Invalid input. Try again.");
                scanner.next();

            }
        } while (flag);

        return (dValue);
    }

    public int inputIntegerValue(){
        Scanner scanner = new Scanner(System.in);
        int iValue = 0;
        boolean flag = true;

        do {
            System.out.print("Enter a four-digit integer number: ");

            if (scanner.hasNextInt()) {
                iValue = abs(scanner.nextInt());
                if ((iValue >= 1000) && (iValue < 10000)) {
                    flag = false;
                }
                else{
                    System.out.println("Invalid input. Value should be a four-digit integer number. Try again.");
                }
            }
            else {
                scanner.next();
                System.out.println("Invalid input. Try again.");
            }
        } while (flag);

        return (iValue);
    }

    public void printRadiusValue (Circle circle){
        System.out.println("Radius is set to: " + circle.getRadius());
    }


}
