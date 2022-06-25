package EasyTests;

import Easy.LongestNonRepeating;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestNonRepeatingTest {

    private LongestNonRepeating lnr;

    @Before
    public void setup() {
        lnr = new LongestNonRepeating();
    }

    @After
    public void breakdown() {
        lnr = null;
    }
    //  Find the longest non repeating substring and its length
    @Test
    public void getLongestNonRepeatingSubString() {
        String actual = lnr.longestSubstring("wackyart");
        String expected = "wacky : 5";

        Assert.assertEquals(expected, actual);
    }
    //  Find the longest non repeating substring and its length with two equal substrings
    @Test
    public void getLongestNonRepeatingSubStringWithTwo() {
        String actual = lnr.longestSubstring("wonkywackyart");
        String expected = "wonky : 5";

        Assert.assertEquals(expected, actual);
    }
}
