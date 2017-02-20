package com.latysheva.training.junit;

import com.latysheva.training.multiplication.MathActionOnNumber;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class MultiplicationTest {
    @Test
    public void multTest() {
        MathActionOnNumber action = new MathActionOnNumber();
        int tmp = action.multiplication4DigitsOfInteger(1234);
        Assert.assertEquals(24, tmp);

    }

}
