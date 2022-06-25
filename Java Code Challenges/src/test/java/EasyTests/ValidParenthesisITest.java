package EasyTests;

import Easy.ValidParenthesisI;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidParenthesisITest {

    private ValidParenthesisI vpi;

    @Before
    public void setup() {
        vpi = new ValidParenthesisI();
    }

    @After
    public void breakdown() {
        vpi = null;
    }
    //  Validate parenthesis are balanced
    @Test
    public void validateBalancedParenthesis() {
        boolean actual = vpi.balanced("((()))()()");
        boolean actual2 = vpi.balanced("");
        boolean expected = true;

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected, actual2);
    }
    //  Catch non balanced parenthesis
    @Test
    public void catchNonBalancedParenthesis() {
        boolean actual = vpi.balanced("(()))");
        boolean actual2 = vpi.balanced(")(");
        boolean actual3 = vpi.balanced("()(");
        boolean expected = false;

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected, actual2);
        Assert.assertEquals(expected, actual3);
    }
}
