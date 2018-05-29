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



    }








