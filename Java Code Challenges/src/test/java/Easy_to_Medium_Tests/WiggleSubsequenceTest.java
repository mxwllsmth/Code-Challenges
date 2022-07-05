package Easy_to_Medium_Tests;

import Easy_to_Medium.WiggleSubsequence;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WiggleSubsequenceTest {

    WiggleSubsequence ws;

    @Before
    public void setup() {
        ws = new WiggleSubsequence();
    }

    @After
    public void breakdown() {
        ws = null;
    }
    //  Get the length of the longest wiggle subsequence from each array
    @Test
    public void getLongestWiggleSubsequenceFromEachArray() {
        int actual = ws.wiggleMaxLength(new int[]{1,7,4,9,2,5});
        int expected = 6;

        int actual2 = ws.wiggleMaxLength(new int[]{1,17,5,10,13,15,10,5,16,8});
        int expected2 = 7;

        int actual3 = ws.wiggleMaxLength(new int[]{1,2,3,4,5,6,7,8,9});
        int expected3 = 2;

        int actual4 = ws.wiggleMaxLength(new int[]{3,3,3,2,5,5,2,3}); // Remove elements to get (3,2,5,2,3) ==> 5
        int expected4 = 5;

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
    }
}
