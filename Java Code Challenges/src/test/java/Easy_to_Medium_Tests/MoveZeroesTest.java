package Easy_to_Medium_Tests;

import Easy_to_Medium.MoveZeroes;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class MoveZeroesTest {

    private MoveZeroes mz;

    @Before
    public void setup() {
        mz = new MoveZeroes();
    }

    @After
    public void breakdown() {
        mz = null;
    }
    //  Shift zeroes to the end of the array
    @Test
    public void getShiftedArrays() {
        int[] actualRaw = mz.moveZeroes(new int[]{1,5,0,4,2,7,9,0,0,3});
        String actual = Arrays.toString(actualRaw);
        String expected = "[1, 5, 4, 2, 7, 9, 3, 0, 0, 0]";

        int[] actual2Raw = mz.moveZeroes(new int[]{6,1,0,0,0,6,0,3,7,3,0});
        String actual2 = Arrays.toString(actual2Raw);
        String expected2 = "[6, 1, 6, 3, 7, 3, 0, 0, 0, 0, 0]";

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }
    @Test
    public void getShiftedArraysForMoveLeft() {
        int[] actualRaw = mz.moveZeroesToTheLeft(new int[]{1,5,0,4,2,7,9,0,0,3});
        String actual = Arrays.toString(actualRaw);
        String expected = "[0, 0, 0, 1, 5, 4, 2, 7, 9, 3]";

        int[] actual2Raw = mz.moveZeroesToTheLeft(new int[]{6,1,0,0,0,6,0,3,7,3,0});
        String actual2 = Arrays.toString(actual2Raw);
        String expected2 = "[0, 0, 0, 0, 0, 6, 1, 6, 3, 7, 3]";

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }
}
