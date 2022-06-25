package EasyTests;

import Easy.RomanToInteger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanToIntegerTest {

    private RomanToInteger rti;

    @Before
    public void setup() {
        rti = new RomanToInteger();
    }

    @After
    public void breakdown() {
        rti = null;
    }
    //  Validate roman to integer conversion
    @Test
    public void verifyRomanToIntegerConversion() {
        int actual = rti.romanToInt("CCCXIII");
        int expected = 313;


        int actual2 = rti.romanToInt("CDLXXVI");
        int expected2 = 476;

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }
}
