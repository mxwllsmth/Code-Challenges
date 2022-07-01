package HardTests;

import Hard.SmallestMissingPositive;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SmallestMissingPositiveTest {

    SmallestMissingPositive smp;

    @Before
    public void setup() {
        smp = new SmallestMissingPositive();
    }

    @After
    public void breakdown() {
        smp = null;
    }
    //  Get first missing positive num
    @Test
    public void getFirstMissingPositiveInteger() {
        //  From array with sequential nums
        int actual = smp.firstMissingPositive(new int[]{1,2,3,4,5});
        int expected = 6;
        //  From array with doubles, zeros, and negative nums
        int actual2 = smp.firstMissingPositive(new int[]{1,20,2,2,2,10,0,4,-3,2,11,3,3,3,0});
        int expected2 = 5;
        //  From array with one value
        int actual3 = smp.firstMissingPositive(new int[]{1});
        int expected3 = 2;
        //  One more
        int actual4 = smp.firstMissingPositive(new int[]{1,0,2});
        int expected4 = 3;

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
    }

}
