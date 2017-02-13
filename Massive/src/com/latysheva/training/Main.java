package com.latysheva.training;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Reading integer from console...");
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        boolean flag = true;
        do {
            System.out.print("Enter a four-digit integer number: ");

            if (scanner.hasNextInt()) {
                value = abs(scanner.nextInt());
                if ((value >= 1000) && (value < 10000)) {
                    flag = false;
                } else {
                    System.out.println("Invalid input. value should be a four-digit integer number. Try again.");
                }
            } else {
                scanner.next();
                System.out.println("Invalid input. Try again.");
            }
        } while (flag);
    }
}
