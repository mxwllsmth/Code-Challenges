package EasyTests;

import Easy.RunLength;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RunLengthTest {

    private RunLength rl;

    @Before
    public void setup() {
        rl = new RunLength();
    }

    @After
    public void breakdown() {
        rl = null;
    }
    //  Validate conversion to run length
    @Test
    public void convertToRunLength() {
        String actual = rl.runLength("rrrooaahatraaa");
        String expected = "3r2o2a1h1a1t1r3a";

        Assert.assertEquals(expected, actual);
    }
}
