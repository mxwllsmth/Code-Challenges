package Easy_to_Medium_Tests;

import Easy_to_Medium.ValidParenthesisII;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidParenthesisIITest {

    private ValidParenthesisII vpii;

    @Before
    public void setup() {
        vpii = new ValidParenthesisII();
    }

    @After
    public void breakdown() {
        vpii = null;
    }
    //  Validate balanced parenthesis
    @Test
    public void validateBalancedParenthesis() {
        boolean actual = vpii.validParenthesis("({{[]}}){}");
        boolean actual2 = vpii.validParenthesis("[{()}]");
        boolean expected = true;

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected, actual2);
    }
    //  Catch unbalanced parenthesis
    @Test
    public void catchUnbalancedParenthesis() {
        boolean actual = vpii.validParenthesis("{{[}}}");
        boolean actual2 = vpii.validParenthesis("{}[]()}");
        boolean actual3 = vpii.validParenthesis("((([{}]])))");
        boolean expected = false;

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected, actual2);
        Assert.assertEquals(expected, actual3);
    }
}
