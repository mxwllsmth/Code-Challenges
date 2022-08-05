package Easy_to_Medium_Tests;

import Easy_to_Medium.MaximumSumOfSubArray;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumSumOfSubArrayTest {

    private MaximumSumOfSubArray msa;

    @Before
    public void setup() {
        msa = new MaximumSumOfSubArray();
    }

    @After
    public void breakdown() {
        msa = null;
    }
    //  Get maximum sum from sub array with positive and negative values
    @Test
    public void getMaxSumFromSubArray() {
        int actual = msa.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
        int expected = 6;

        int actual2 = msa.maxSubArray(new int[] {-4,-1,-5,-2,-1});
        int expected2 = -1;

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }
    //  Get maximum sum from sub array with all negative values
    @Test
    public void getMaxSumFromSubArrayAllNegatives() {
        int actual = msa.maxSubArray(new int[] {-2,-1,-3,-4,-1,-2,-1,-5,-4});
        int expected = -1;

        Assert.assertEquals(expected, actual);
    }

}
