package Easy_to_Medium_Tests;

import Easy_to_Medium.PalindromeString;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeStringTest {

    private PalindromeString ps;

    @Before
    public void setup() {
        ps = new PalindromeString();
    }

    @After
    public void breakdown() {
        ps = null;
    }
    //  Verify palindrome
    @Test
    public void verifyPalindromeNumber() {
        boolean actual = ps.isPalindrome("tacocat");
        boolean expected = true;

        Assert.assertEquals(expected, actual);
    }
    //  Catch not a palindrome
    @Test
    public void verifyNotAPalindromeNumber() {
        boolean actual = ps.isPalindrome("Maxwell");
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }
}
