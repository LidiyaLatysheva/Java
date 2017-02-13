package com.latysheva.training.main;


import com.latysheva.training.common.InputOutput;
import com.latysheva.training.multiplication.MathActionOnNumber;

import java.io.File;
import java.util.ArrayList;


public class Main {
    private static final String FILEPATH = "D:\\JavaFundamentalsTraining\\Task1.2_digitsMultiptication\\resource\\number.txt";
    private static final String RECORDFILEPATH = "D:\\JavaFundamentalsTraining\\Task1.2_digitsMultiptication\\resource\\calculatednumber.txt";


    public static void main(String[] args) {
        // write your code here
        InputOutput inputOutput = new InputOutput();

        File fileToRead = new File(FILEPATH);
        File fileToWrite = new File(RECORDFILEPATH);
        ArrayList value = new ArrayList();
        ArrayList calculatedvalue = new ArrayList();
        MathActionOnNumber mult = new MathActionOnNumber();

        value = inputOutput.readIntFromFile(fileToRead);
        calculatedvalue = mult.multiplication4DigitsOfIntegerArrayList(value);
        inputOutput.printResultToConsoleArrayList(calculatedvalue);
        inputOutput.printResultToFileArrayList(value,calculatedvalue,fileToWrite);


    }
}