package EasyTests;

import Easy.RotateArrayKSteps;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class RotateArrayKStepsTest {

    private RotateArrayKSteps raks;

    @Before
    public void setup() {
        raks = new RotateArrayKSteps();
    }

    @After
    public void breakdown() {
        raks = null;
    }
    //  Validate rotated array
    @Test
    public void validateRotatedArray() {
        int[] actualRaw = raks.rotateArray(new int[]{2,5,2,6,7,3,2,5,6,1}, 6);
        String actual = Arrays.toString(actualRaw);
        String expected = "[7, 3, 2, 5, 6, 1, 2, 5, 2, 6]";

        Assert.assertEquals(expected, actual);
    }
    //  Validate rotated array where steps > array.length
    @Test
    public void validateRotatedArrayWithMoreStepsThanNecessary() {
        int[] actualRaw = raks.rotateArray(new int[]{3,8,4,1,0,7,4,8,3,2,6,2}, 28);
        String actual = Arrays.toString(actualRaw);
        String expected = "[3, 2, 6, 2, 3, 8, 4, 1, 0, 7, 4, 8]";

        Assert.assertEquals(expected, actual);
    }
    //  Validate rotated array with one element
    @Test
    public void validateRotatedArrayWithOneElement() {
        int[] actualRaw = raks.rotateArray(new int[]{-1}, 4);
        String actual = Arrays.toString(actualRaw);
        String expected = "[-1]";

        Assert.assertEquals(expected, actual);
    }
}
