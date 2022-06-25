package MediumTests;

import Medium.PickingNumbers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
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
    @Test
    public void getLongestTicketString() {
        List<Integer> test1 = Arrays.asList(1,7,3,5,3,2,5,6,3,1,1,2,4,5,3,2,5,3,5);
        int actual = pn.maxTickets(test1);
        int expected = 18;

        Assert.assertEquals(expected, actual);
    }

}
