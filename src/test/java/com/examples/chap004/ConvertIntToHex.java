package com.examples.chap004;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertIntToHex {

    @Test
    public static void main(String args[]) {

        /* This is first steps (it's wrong */
        String b = Integer.toHexString(11);
        System.out.println("Hex value is 11" + b);

        String a = Integer.toHexString(10);
        System.out.print("Hex value is 10" + a);

        Integer tree = new Integer(3);
        assertEquals("int value returns 3", 3, tree.intValue());

        Integer sample = new Integer(5);
        assertEquals("int value returns 5", 5, sample.intValue());

        /* conver numbers toHex exercise chap 004 */

        Integer i = new Integer(11);
        System.out.println("   returns Hex number = " + Integer.toHexString(i));

        Integer numberValue = new Integer(10);
        System.out.println("returns Hex number = " + Integer.toHexString(numberValue));

        Integer threeValue = new Integer ("3");
        System.out.println("returns simple number = " + Integer.toString(threeValue));

        Integer twentyoneValue = new Integer("15");
        System.out.println("convert twentyone to fifteen = " + twentyoneValue);


    }

}






