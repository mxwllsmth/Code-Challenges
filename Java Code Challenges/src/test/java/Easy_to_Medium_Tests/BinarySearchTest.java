package Easy_to_Medium_Tests;

import Easy_to_Medium.BinarySearch;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {

    private BinarySearch bs;

    @Before
    public void setup() {
        bs = new BinarySearch();
    }

    @After
    public void breakdown() {
        bs = null;
    }

    @Test
    //  Find target index
    public void getTargetIndex() {
        int actual = bs.search(new int[]{8,9,10}, 10);
        int expected = 2;

        Assert.assertEquals(expected, actual);
    }
    @Test
    //  Fail to find target index
    public void failToFindTargetIndex() {
        int actual = bs.search(new int[]{8,9,10}, 2);
        int expected = -1;

        Assert.assertEquals(expected, actual);
    }
}
