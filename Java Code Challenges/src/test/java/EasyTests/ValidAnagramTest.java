package EasyTests;

import Easy.ValidAnagram;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidAnagramTest {

    private ValidAnagram va;

    @Before
    public void setup() {
        va = new ValidAnagram();
    }

    @After
    public void breakdown() {
        va = null;
    }
    //  Validate anagram
    @Test
    public void validateAnagram() {
        boolean actual = va.isAnagram("boogie", "oogbie");
        boolean actual2 = va.isAnagram("alloprfieo", "laoplfrioe");
        boolean expected = true;

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected, actual2);
    }
    //  Catch not an anagram
    @Test
    public void catchNotAnAnagram() {
        boolean actual = va.isAnagram("Maxwell", "SomeoneElse");
        boolean actual2 = va.isAnagram("others", "otherd");
        boolean expected = false;

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected, actual2);
    }
}
