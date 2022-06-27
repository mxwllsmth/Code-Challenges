package Easy_to_Medium_Tests;

import Easy_to_Medium.FizzBuzz;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzTest {

    private FizzBuzz fb;

    @Before
    public void setup() {
        fb = new FizzBuzz();
    }

    @After
    public void breakdown() {
        fb = null;
    }

    @Test
    //  Convert values where appropriate
    public void getTargetIndex() {
        List<String> actual = fb.fizzBuzz(new int[]{8,20,3,15,5,9,2});
        List<String> expected = Arrays.asList("8", "Fizz", "Buzz", "FizzBuzz", "Fizz", "Buzz", "2");

        Assert.assertEquals(expected, actual);
    }
}
