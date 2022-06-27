package Easy_to_Medium_Tests;

import Easy_to_Medium.PickingNumbers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PickingNumbersTest {

    private PickingNumbers pn;

    @Before
    public void setup() {
        pn = new PickingNumbers();
    }

    @After
    public void breakdown() {
        pn = null;
    }
    //  Get the longest valid ticket string
    //  Both methods from the picking numbers code challenge are tested here
    @Test
    public void getLongestTicketString() {
        List<Integer> test1 = Arrays.asList(10,9,3,5,3,2,5,9,3,16,1,2,42,5,3,2,10,3,5);
        List<Integer> test2 = Arrays.asList(1, 2, 2, 3, 1, 2);
        int actual = pn.maxTickets(test1);
        int actual2 = pn.maxTickets(test2);

        int actualV2 = pn.maxTicketsV2(test1);
        int actualV2_2 = pn.maxTickets(test2);

        int expected = 9;
        int expected2 = 6;

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected, actualV2);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected2, actualV2_2);
    }

}
