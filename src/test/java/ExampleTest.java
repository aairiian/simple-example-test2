import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ExampleTest {

    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2 + 2;
        assertEquals("2+2=4", 4, answer);
    }

    @Test
    public void canSubtractTwoMinusTwo() {
        int answer = 2 - 2;
        assertEquals("2-2=0", 0, answer);
    }

    @Test
    public void canDivideTwoDivideTwo() {
        int answer = 2 / 2;
        assertEquals("2/2=1", 1, answer);
    }

    @Test
    public void canMultiplyTwoMultiplyTwo() {
        int answer = 2 * 2;
        assertEquals("2*2=4", 4, answer);
    }

    /* / Learning short and long values */
    @Test

    public static void main(String[] args) {

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


}

