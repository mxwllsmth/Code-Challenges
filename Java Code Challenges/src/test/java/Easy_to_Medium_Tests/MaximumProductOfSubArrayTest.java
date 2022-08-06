package Easy_to_Medium_Tests;

import Easy_to_Medium.MaximumProductOfSubArray;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumProductOfSubArrayTest {

    private MaximumProductOfSubArray mposa;

    @Before
    public void setup() {
        mposa = new MaximumProductOfSubArray();
    }

    @After
    public void breakdown() {
        mposa = null;
    }
    //  Get maximum product from sub array with positive and negative values
    @Test
    public void getMaxSumFromSubArray() {
        int actual = mposa.maxProductOfSubArray(new int[] {1,-2,-3,2,7,2,-2,2,-2});
        int expected = 1344;

        Assert.assertEquals(expected, actual);
    }
    //  Get maximum sum from sub array with all negative values
    @Test
    public void getMaxSumFromSubArrayAllNegatives() {
        int actual = mposa.maxProductOfSubArray(new int[] {-2,-1,-3,-4,-1,-2,-1,-5,-4});
        int expected = 480;

        Assert.assertEquals(expected, actual);
    }
    //  Get maximum sum from sub array with zeros
    @Test
    public void getMaxSumFromSubArrayZeros() {
        int actual = mposa.maxProductOfSubArray(new int[] {2,4,0,9,0,3,2,0});
        int expected = 9;

        Assert.assertEquals(expected, actual);
    }
}
