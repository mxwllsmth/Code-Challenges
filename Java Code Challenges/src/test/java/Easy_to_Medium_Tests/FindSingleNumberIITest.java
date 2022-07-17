package Easy_to_Medium_Tests;

import Easy_to_Medium.FindSingleNumberII;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindSingleNumberIITest {

    FindSingleNumberII fsn;

    @Before
    public void setup() {
        fsn = new FindSingleNumberII();
    }

    @After
    public void breakdown() {
        fsn = null;
    }

    @Test
    public void getSingleNumberFromArray() {
        int actual = fsn.singleNumber(new int[]{8,1,2,4,1,8,3,4,2,2,1,4,6,8,3,3});
        int expected = 6;

        Assert.assertEquals(expected, actual);
    }
}
