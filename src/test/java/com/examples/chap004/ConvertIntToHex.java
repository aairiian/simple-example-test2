package com.examples.chap004;
import org.junit.Test;

public class ConvertIntToHex {

    @Test
    public static void main (String args[]) {

        String b = Integer.toHexString (11);
        System.out.println ("Hex value is 11" + b);

        String a = Integer.toHexString (10);
        System.out.print ("Hex value is 10" + a);

    }


}