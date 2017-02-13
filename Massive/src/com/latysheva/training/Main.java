package com.latysheva.training;

import java.util.ArrayList;
import java.util.Scanner;

/*
Дана последовательность натуральных чисел а1 , а2 ,..., ап.
Создать массив из четных чисел этой последовательности.
Если таких чисел нет, то вывести сообщение об этом факте.
 */

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Reading natural number from console...");
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        ArrayList valueArray = new ArrayList();
        boolean flag = true;
// Enter an array dimension
        do {
            System.out.print("Enter an array dimension: ");

            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value > 0) {
                    flag = false;
                } else {
                    System.out.println("Invalid input. value should be a natural integer number. Try again.");
                }
            } else {
                scanner.next();
                System.out.println("Invalid input. Try again.");
            }
        } while (flag);


// Enter values to array
        System.out.println("Enter values to array...");
        flag = true;
        for (int i = 0; i < value; i++) {
            do {
                System.out.print("Enter " + (i + 1) + " natural number: ");

                if (scanner.hasNextInt()) {
                    valueArray.add(scanner.nextInt());
                    if ((Integer) valueArray.get(i) > 0) {
                        flag = false;
                    } else {
                        System.out.println("Invalid input. value should be a natural number. Try again.");
                    }
                } else {
                    scanner.next();
                    System.out.println("Invalid input. Try again.");
                }
            } while (flag);
        }

// Create new array of even numbers
        ArrayList evenValueArray = new ArrayList();
        for (int i = 0; i < value; i++) {
            int tmp = (Integer) valueArray.get(i) % 2;
            if (tmp == 0) {
                evenValueArray.add(valueArray.get(i));
            }
        }

// Print result array
        System.out.println("Print result array...");
        value = evenValueArray.size();
        if (value > 0) {
            for (int i = 0; i < value; i++) {
                System.out.println("Value " + i + " " + evenValueArray.get(i));
            }
        } else {
            System.out.println("There are no even numbers.");
        }
    }
}
