package Easy_to_Medium_Tests;

import Easy_to_Medium.MedianOfTwoSortedArrays;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MedianOfTwoSortedArraysTest {

    MedianOfTwoSortedArrays motsa;

    @Before
    public void setup() {
        motsa = new MedianOfTwoSortedArrays();
    }

    @After
    public void breakdown() {
        motsa = null;
    }
    //  Get median of even and odd arrays
    @Test
    public void getMedianOfSortedArrays() {
        double actual = motsa.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4});
        double expected = 2.5;

        double actual2 = motsa.findMedianSortedArrays(new int[]{1,5,9}, new int[]{3,4});
        double expected2 = 4;

        Assert.assertEquals(expected, actual, 0);
        Assert.assertEquals(expected2, actual2, 0);
    }
}
