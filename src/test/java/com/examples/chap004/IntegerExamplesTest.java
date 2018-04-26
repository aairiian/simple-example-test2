package com.examples.chap004;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class IntegerExamplesTest {

    @Test
    public void intengerExploration (){
        Integer four = new Integer(4);
        assertEquals("Intvalue returns int 4", 4, four.intValue());

        Integer five = new Integer(5);
        assertEquals("Ïntvalue returns int 5", 5,five.intValue());

        Integer six = 6;
        assertEquals("autoboxing assigment for 6", 6, six.intValue());

        Integer seven = new Integer(7);
        assertEquals("IntValue returns int 7", 7, seven.intValue());




    }
       @Test
       public static void main(String args[]) {
           int i = 11;
           String b = Integer.toHexString(i);
           System.out.println("Hex value is 11" + b);
    }
}




