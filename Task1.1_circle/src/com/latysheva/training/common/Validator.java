package com.latysheva.training.common;

/**
 * Created by Lidziya_Latyshava on 2/15/2017.
 */
public class Validator {
    public boolean is4digitInteger (int value){
        if ((value >= 1000) && (value < 10000)) {
            return true;
        }
        else{
            System.out.println("Invalid input. Value should be a four-digit integer number. Try again.");
            return false;
        }
    }
}
