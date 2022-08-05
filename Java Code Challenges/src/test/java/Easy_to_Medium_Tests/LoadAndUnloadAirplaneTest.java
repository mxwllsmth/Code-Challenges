package Easy_to_Medium_Tests;

import Easy_to_Medium.LoadAndUnloadAirplane;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoadAndUnloadAirplaneTest {

    LoadAndUnloadAirplane laua;

    @Before
    public void setup() {
        laua = new LoadAndUnloadAirplane();
    }

    @After
    public void breakdown() {
        laua = null;
    }
    //  Load and Unload plane - return string of bags unloaded
    @Test
    public void getStringOfUnloadedBags() {
        String actual = laua.loadAndUnloadBags("12,20,5,5,10,5,10,9,38,25,25,17,20");
        String expected = "17,20,25,25,38,5,10,5,10,9,12,20,5";
        String actual2 = laua.loadAndUnloadBags("12,10,8");
        String expected2= "12,10,8";
        String actual3 = laua.loadAndUnloadBags("24,35,28");
        String expected3 = "28,35,24";

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }
}
