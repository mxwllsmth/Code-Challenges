package Easy_to_Medium_Tests;

import Easy_to_Medium.MaximumMeetingsForOnePerson;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MaximumMeetingsForOnePersonTest {

    MaximumMeetingsForOnePerson mmior;

    @Before
    public void setup() {
        mmior = new MaximumMeetingsForOnePerson();
    }

    @After
    public void breakdown() {
        mmior = null;
    }
    //  Get the number of meetings that can be attended by one person
    @Test
    public void getMostMeetingsThatCanBeAttended() {
        //  Linear - attend all
        List<Integer> startTimes1 = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> endTimes1 = Arrays.asList(2,3,4,5,6,7,8,9);
        int actual1_V1 = mmior.maxPresentations(startTimes1, endTimes1);
        int actual1_V2 = mmior.maxPresentationsV2(startTimes1, endTimes1);
        int expected1 = 8;
        //  Many overlaps
        List<Integer> startTimes2 = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> endTimes2 = Arrays.asList(7,4,4,5,6,9,8,9);
        int actual2_V1 = mmior.maxPresentations(startTimes2, endTimes2);
        int actual2_V2 = mmior.maxPresentationsV2(startTimes2, endTimes2);
        int expected2 = 5;
        //  Many similar times
        List<Integer> startTimes3 = Arrays.asList(1,3,3,3,4,7,7,7);
        List<Integer> endTimes3 = Arrays.asList(4,4,4,5,6,9,8,9);
        int actual3_V1 = mmior.maxPresentations(startTimes3, endTimes3);
        int actual3_V2 = mmior.maxPresentationsV2(startTimes3, endTimes3);
        int expected3 = 3;
        //  Only one
        List<Integer> startTimes4 = Arrays.asList(1,2,3,5,5,7,7,8);
        List<Integer> endTimes4 = Arrays.asList(9,9,9,9,9,9,9,9);
        int actual4_V1 = mmior.maxPresentations(startTimes4, endTimes4);
        int actual4_V2 = mmior.maxPresentationsV2(startTimes4, endTimes4);
        int expected4 = 1;

        Assert.assertEquals(expected1, actual1_V1);
        Assert.assertEquals(expected1, actual1_V2);

        Assert.assertEquals(expected2, actual2_V1);
        Assert.assertEquals(expected2, actual2_V2);

        Assert.assertEquals(expected3, actual3_V1);
        Assert.assertEquals(expected3, actual3_V2);

        Assert.assertEquals(expected4, actual4_V1);
        Assert.assertEquals(expected4, actual4_V2);
    }
}
