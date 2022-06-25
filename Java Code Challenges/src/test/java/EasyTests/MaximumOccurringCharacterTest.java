package EasyTests;

import Easy.MaximumOccurringCharacter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumOccurringCharacterTest {

    private MaximumOccurringCharacter moc;

    @Before
    public void setup() {
        moc = new MaximumOccurringCharacter();
    }

    @After
    public void breakdown() {
        moc = null;
    }
    //  Find maximum occurring character with a tie
    @Test
    public void getMaximumOccurringCharacter() {
        char actual = moc.maximumOccurringCharacter("maximumx");
        char expected = 'm';

        Assert.assertEquals(expected, actual);
    }
}
