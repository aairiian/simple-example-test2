package com.examples.chap004;

import org.junit.Test;

public class SimpleTest {

    @Test
    public static void main(String[] args) {
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
}
