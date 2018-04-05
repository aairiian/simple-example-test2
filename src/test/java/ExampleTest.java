import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

    @Test
    public void test () {
        // step by step
        System.out.println("My first test");
        Assert.assertEquals("2+2 is not equal to 4", 3, 2+2);

    }
}
