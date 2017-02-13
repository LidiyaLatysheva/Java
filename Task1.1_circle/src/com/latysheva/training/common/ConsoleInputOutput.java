package com.latysheva.training.common;


import com.latysheva.training.figure.Circle;

import java.util.Scanner;

import static java.lang.Math.abs;

public class ConsoleInputOutput {
    public double inputDoubleValue (){
        Scanner scanner = new Scanner(System.in);
        double value = 0;
        boolean flag = true;

        do {
            System.out.print("Enter double number: ");
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                if (value < 0){
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

        return (value);
    }

    public int inputIntegerValue(){
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        boolean flag = true;

        do {
            System.out.print("Enter a four-digit integer number: ");

            if (scanner.hasNextInt()) {
                value = abs(scanner.nextInt());
                if ((value >= 1000) && (value < 10000)) {
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

        return (value);
    }

    public void printRadiusValue (Circle circle){
        System.out.println("Radius is set to: " + circle.getRadius());
    }


}
