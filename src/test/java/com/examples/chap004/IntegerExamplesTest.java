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
    }

    @Test

    public void toHexString () {

    }

}
