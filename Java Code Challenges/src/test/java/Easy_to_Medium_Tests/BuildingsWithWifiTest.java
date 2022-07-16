package Easy_to_Medium_Tests;

import Easy_to_Medium.BuildingsWithWifi;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BuildingsWithWifiTest {

    BuildingsWithWifi bww;

    @Before
    public void setup() {
        bww = new BuildingsWithWifi();
    }

    @After
    public void breakdown() {
        bww = null;
    }
    //  Only one building served
    @Test
    public void getOneBuildingsServed() {
        List<Integer> buildingCountTestValues = Arrays.asList(6,5,6,4,7,4);
        List<Integer> routerLocationTestValues = Arrays.asList(1,2,3,4,5,6);
        List<Integer> routerRangeTestValues = Arrays.asList(2,1,2,1,2,2);
        int actual = bww.getServedBuildings(buildingCountTestValues, routerLocationTestValues, routerRangeTestValues);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }
    //  Three buildings served
    @Test
    public void getThreeBuildingsServed() {
        List<Integer> buildingCountTestValues = Arrays.asList(2,3,3,1,5,6);
        List<Integer> routerLocationTestValues = Arrays.asList(2,4,1);
        List<Integer> routerRangeTestValues = Arrays.asList(2,4,3);
        int actual = bww.getServedBuildings(buildingCountTestValues, routerLocationTestValues, routerRangeTestValues);
        int expected = 4;

        Assert.assertEquals(expected, actual);
    }
    //  Four buildings served
    @Test
    public void getFourBuildingsServed() {
        List<Integer> buildingCountTestValues = Arrays.asList(1,2,1,3,1,1);
        List<Integer> routerLocationTestValues = Arrays.asList(1,4,6);
        List<Integer> routerRangeTestValues = Arrays.asList(2,1,2);
        int actual = bww.getServedBuildings(buildingCountTestValues, routerLocationTestValues, routerRangeTestValues);
        int expected = 4;

        Assert.assertEquals(expected, actual);
    }
    //  All buildings served
    @Test
    public void getAllBuildingsServed() {
        List<Integer> buildingCountTestValues = Arrays.asList(1,3,2,4,2,1);
        List<Integer> routerLocationTestValues = Arrays.asList(2,4,5,6);
        List<Integer> routerRangeTestValues = Arrays.asList(2,3,2,6);
        int actual = bww.getServedBuildings(buildingCountTestValues, routerLocationTestValues, routerRangeTestValues);
        int expected = 6;

        Assert.assertEquals(expected, actual);
    }
    //  All buildings served - multiple routers in some buildings
    @Test
    public void getAllBuildingsServedWithMultipleInABuilding() {
        List<Integer> buildingCountTestValues = Arrays.asList(6,5,6,12,7,4);
        List<Integer> routerLocationTestValues = Arrays.asList(2,5,5,5,5,1,4,4,4,4,3,3,3,3,6);
        List<Integer> routerRangeTestValues = Arrays.asList(1,2,2,2,2,0,1,1,1,1,2,2,2,2,0);
        int actual = bww.getServedBuildings(buildingCountTestValues, routerLocationTestValues, routerRangeTestValues);
        int expected = 6;

        Assert.assertEquals(expected, actual);
    }
    //  No buildings are served
    @Test
    public void getNoBuildingsServed() {
        List<Integer> buildingCountTestValues = Arrays.asList(6,5,6,4,7,4);
        List<Integer> routerLocationTestValues = Arrays.asList(1,2,3,4,5,6);
        List<Integer> routerRangeTestValues = Arrays.asList(2,1,2,1,2,1);
        int actual = bww.getServedBuildings(buildingCountTestValues, routerLocationTestValues, routerRangeTestValues);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

}
