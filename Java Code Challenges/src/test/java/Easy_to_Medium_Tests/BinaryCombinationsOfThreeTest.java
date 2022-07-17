package Easy_to_Medium_Tests;

import Easy_to_Medium.BinaryCombinationsOfThree;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryCombinationsOfThreeTest {

    BinaryCombinationsOfThree bcot;

    @Before
    public void setup() {
        bcot = new BinaryCombinationsOfThree();
    }

    @After
    public void breakdown() {
        bcot = null;
    }

    @Test
    public void getOneCombination() {
        int actual = bcot.getBinaryCombinationsOfThree(new int[]{1,0,1});
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getThreeCombinations() {
        int actual = bcot.getBinaryCombinationsOfThree(new int[]{0,1,0,1,1});
        int expected = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getManyCombinations() {
        int actual = bcot.getBinaryCombinationsOfThree(new int[]{0,0,1,0,1,0,1,0,1,1,1});
        int expected = 38;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNoCombinations() {
        int actual = bcot.getBinaryCombinationsOfThree(new int[]{1,1,1,1,1,1,1,1,1,1,1,1});
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

}
