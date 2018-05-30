package com.examples.chap004;

import org.junit.Test;

import static java.lang.Integer.*;
import static java.lang.Integer.MIN_VALUE;
import static org.junit.Assert.assertEquals;

public class ConvertIntToHex {

    @Test
    public  void canConvertInttoHex () {

        assertEquals("int 11 to hex", "b", toHexString(11));
        System.out.println("int 11 to hex = " + toHexString(11));

        assertEquals("int 10 to hex ", "a", toHexString(10));
        System.out.println("int 10 to hex = " + toHexString(10));

        assertEquals("int 3 to hex", "3", toHexString(3));
        System.out.println("int 3 to hex = " + toHexString(3));

        assertEquals("int 21 to hex", "15", toHexString(21));
        System.out.println("int 21 to hex = " + toHexString(21));

    }

    @Test
    public void maxAndMinValue () {
        int MIN_VALUE = -2147483648;
        int MAX_VALUE = 2147483647;

        assertEquals("int Max Value", -2147483648, Integer.MIN_VALUE);
        assertEquals(" return Max Value", 2147483647, Integer.MAX_VALUE);
        System.out.println("return Min Value = " + Integer.MIN_VALUE);
        System.out.println("return Max Value = " + Integer.MAX_VALUE);
    }



    }








