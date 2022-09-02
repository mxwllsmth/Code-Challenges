package HardTests;

import Hard.TrappingRainWater;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrappingRainWaterTest {

    TrappingRainWater trw;

    @Before
    public void setup() {
        trw = new TrappingRainWater();
    }

    @After
    public void breakdown() {
        trw = null;
    }

    @Test
    public void getRainWaterTrappedReturnSix() {
        int actual = trw.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        int expected = 6;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getRainWaterTrappedReturnNine() {
        int actual = trw.trap(new int[]{4,2,0,3,2,5});
        int expected = 9;

        Assert.assertEquals(expected, actual);
    }

}
