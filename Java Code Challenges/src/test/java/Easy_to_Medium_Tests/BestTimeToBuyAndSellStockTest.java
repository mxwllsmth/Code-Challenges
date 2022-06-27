package Easy_to_Medium_Tests;

import Easy_to_Medium.BestTimeToBuyAndSellStock;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {

    private BestTimeToBuyAndSellStock bttbass;

    @Before
    public void setup() {

        bttbass = new BestTimeToBuyAndSellStock();

    }

    @After
    public void breakdown() {

        bttbass = null;

    }
    //  High profit value updates three times and low buy cost adjusts once
    @Test
    public void getHighestPossibleProfit() {
        int actual = bttbass.maxProfit(new int[]{2,5,2,11,1,6,12});
        int expected = 11;

        Assert.assertEquals(expected, actual);
    }
    //  No profit can be made
    @Test
    public void getHighestPossibleProfitNonePossible() {
        int actual = bttbass.maxProfit(new int[]{10,7,4,2,1,1,1});
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
    //  No profit can be made - no input
    @Test
    public void getHighestPossibleProfitNonePossibleNoInfo() {
        int actual = bttbass.maxProfit(new int[]{});
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

}
