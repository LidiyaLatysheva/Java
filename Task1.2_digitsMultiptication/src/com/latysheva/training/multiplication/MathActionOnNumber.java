package com.latysheva.training.multiplication;


import java.util.ArrayList;

public class MathActionOnNumber {
    public int multiplication4DigitsOfInteger(int number) {
        int multValue = 1;
        while (number >= 10) {
            int i = number % 10;
            multValue = multValue * i;
            number = number / 10;
        }
        multValue = multValue * number;

        return multValue;
    }

    public ArrayList multiplication4DigitsOfIntegerArrayList(ArrayList<Integer> values){
        ArrayList calculatedValues = new ArrayList();
        int size = values.size();
        for (int i = 0; i < size; i++) {
            int digit = values.get(i);
            calculatedValues.add(multiplication4DigitsOfInteger(digit));
        }
        return calculatedValues;
    }
}
