package com.examples.chap004;
import org.junit.Test;

import static java.lang.Integer.toHexString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class IntegerExamplesTest {

    /*/ Learn Integer class from JavaForTesters (chapter 4)*/
    @Test
    public void integerExploration(){

        Integer four = new Integer(4);
        assertEquals("Intvalue returns int 4", 4, four.intValue());

        Integer five = new Integer(5);
        assertEquals("Ïntvalue returns int 5", 5,five.intValue());

        Integer six = 6;
        assertEquals("autoboxing assigment for 6", 6, six.intValue());

        Integer seven = new Integer(7);
        assertEquals("IntValue returns int 7", 7, seven.intValue());
        }

 /*/ Convert int value to hex - exercises from JavaForTesters (chapter 4)*/
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


    /* / Learn short, long and byte values from video tutorial */

    @Test
    public void typeOfInteger () {

        byte myByteValue = 20;
        System.out.println("my New Byte Value = " + myByteValue);

        short myShortValue = 1;
        System.out.println("my short Value = " + myShortValue);

        int myIntValue = 100;
        System.out.println("my Int Value = " + myIntValue);

        long myLongValue = 98765432;
        long myEqualValue = (long) (myLongValue * 500 + 10);
        System.out.println("my Equal Value = " + myEqualValue);

        long sumValues = (long) (myByteValue + myShortValue + myIntValue);
        System.out.println("sum Values of byte/short and int = " + sumValues);

    }

    /* / Exercises to Video Tutorial of Java */
    @Test

    public void exerciseFromVideoTutorial () {

        byte byteValue = 10;
        short shortValue = 1;
        int intValue = 100;
        long longValue = (5000L + 10L) * 10;

        System.out.println("returns long Value = " + longValue);

        long sumOfValues = byteValue + shortValue + intValue;
        System.out.println("returns sum of value: byte, short, int = " + sumOfValues);


        byte myByteValue = 10;
        short myShortValue = 20;
        int myIntValue = 50;
        long myTotalValue = 50000L + 10L * (myByteValue + myShortValue + myIntValue);
        short myToatalshortValue = (short) (1000 + 10 * (myByteValue + myShortValue + myIntValue));
        System.out.println("returns total long value = " + myTotalValue);
        System.out.println("returns total short value = " + myToatalshortValue);
    }
    /*/ Learn MIN AND MAX VALUE from video tutorial */
    @Test
    public void maxAndMinValue () {
        int MIN_VALUE = -2147483648;
        int MAX_VALUE = 2147483647;

        assertEquals("int Max Value", -2147483648, Integer.MIN_VALUE);
        assertEquals(" return Max Value", 2147483647, Integer.MAX_VALUE);
        System.out.println("return Min Value = " + Integer.MIN_VALUE);
        System.out.println("return Max Value = " + Integer.MAX_VALUE);
    }
    /*/Check that 4==4* - exercises from video tutorial of Java  */
    @Test
    public void checkEqualValues () {

        Integer firstValue = new Integer(4);
        Integer secondValue = new Integer(4);

        assertTrue(firstValue.equals(secondValue));
    }

    /*/ Exercises from video tutorial of Java */
    @Test
    public void canKiloToPound () {
        double poundsValue = 10d;
        double convertPoundstoKilo = poundsValue * 0.45359237d;

        System.out.println("convert Pounds to Kilogram is = " + convertPoundstoKilo);
        /* exercises to video tutorial 4-18 */

    }

}






