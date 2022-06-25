package EasyTests;

import Easy.TwoSum;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class TwoSumTest {

    private TwoSum ts;

    @Before
    public void setup() {
        ts = new TwoSum();
    }

    @After
    public void breakdown() {
        ts = null;
    }
    //  Get two index that add to the target value
    @Test
    public void getIndexThatAddToTarget() {
        int[] actualRaw = ts.twoSum(new int[]{1,5,7,2,5}, 8);
        String actual = Arrays.toString(actualRaw);
        String expected = "[0, 2]";

        Assert.assertEquals(expected, actual);
    }
}
