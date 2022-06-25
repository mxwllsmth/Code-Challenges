package EasyTests;

import Easy.PalindromeNumber;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeNumberTest {

    private PalindromeNumber pn;

    @Before
    public void setup() {
        pn = new PalindromeNumber();
    }

    @After
    public void breakdown() {
        pn = null;
    }
    //  Verify palindrome
    @Test
    public void verifyPalindromeNumber() {
        boolean actual = pn.isPalindrome(22022);
        boolean expected = true;

        Assert.assertEquals(expected, actual);
    }
    //  Catch not a palindrome
    @Test
    public void verifyNotAPalindromeNumber() {
        boolean actual = pn.isPalindrome(472920);
        boolean expected = false;

        Assert.assertEquals(expected, actual);
    }
}
