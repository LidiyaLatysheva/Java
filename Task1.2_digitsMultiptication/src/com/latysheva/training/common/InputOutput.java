package com.latysheva.training.common;

import static java.lang.Math.abs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class InputOutput {

    public double inputDoubleValue() {
        System.out.println("Reading integer from console...");
        Scanner scanner = new Scanner(System.in);
        double value = 0;
        boolean flag = true;
        do {
            System.out.print("Enter double number: ");
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                if (value < 0) {
                    System.out.println("Invalid input. Value should be positive. Try again.");
                } else {
                    flag = false;
                }
            } else {
                System.out.println("Invalid input. Try again.");
                scanner.next();
            }
        } while (flag);
        return (value);
    }

    public int inputIntegerValue() {
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

        return (value);
    }

    public ArrayList readIntFromFile(File file) {
        System.out.println("Reading integer from file...");
        Scanner scanner;
        int tmpValue = 0;
        ArrayList value = new ArrayList();
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                if (scanner.hasNextInt()) {
                    tmpValue = abs(scanner.nextInt());
                    Validator validator = new Validator();
                    if (validator.is4digitInteger(tmpValue)) {
                        value.add(tmpValue);
                    }
                } else {
                    scanner.next();
                }
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return value;
    }

    public void printResultToConsoleArrayList(ArrayList values) {
        int size = values.size();
        for (int i = 0; i < size; i++) {
            System.out.println(i + " Calculated value is: " + values.get(i));
        }
    }

    public void printResultToFileArrayList(ArrayList enteredValues, ArrayList calculatedValues, File fileToWrite) {
        int size = enteredValues.size();
        try {
            FileWriter fileWriter = new FileWriter(fileToWrite);
            for (int i = 0; i < size; i++) {
                String line = (String) "Entered value is " + enteredValues.get(i) + ". Calculated value is " + calculatedValues.get(i) + ". \n ";
                fileWriter.write(line);
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


