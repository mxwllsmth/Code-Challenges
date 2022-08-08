package Easy_to_Medium_Tests;

import Easy_to_Medium.LongestBalancedParenthesis;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestBalancedParenthesisTest {

    LongestBalancedParenthesis lbp;

    @Before
    public void setup() {
        lbp = new LongestBalancedParenthesis();
    }
    @After
    public void breakdown() {
        lbp = null;
    }
    @Test
    public void getLongestSetOfBalancedParenthesis() {
        String actual = lbp.getLongestSetOfBalancedParenthesis("()()()(())))((((())))()()())");
        String expected = "((((())))()()())";

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getLongestSetOfBalancedParenthesisII() {
        String actual = lbp.getLongestSetOfBalancedParenthesis("())()()(())");
        String expected = "()()(())";

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getLongestSetOfBalancedParenthesisNone() {
        String actual = lbp.getLongestSetOfBalancedParenthesis(")(");
        String expected = "";

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getLongestSetOfBalancedParenthesisMultipleSets() {
        String actual = lbp.getLongestSetOfBalancedParenthesis(")))()()()()))(((())))()()(()))()((()()()()(((");
        String expected = "(((())))()()(())";

        Assert.assertEquals(expected, actual);
    }
}
