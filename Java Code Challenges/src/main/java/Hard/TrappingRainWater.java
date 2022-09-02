package Hard;

public class TrappingRainWater {

    public int trap(int[] height) {

        int[] leftWallHighArr = new int[height.length];
        int[] rightWallHighArr = new int[height.length];
        int rightHigh = 0;
        int leftHigh = 0;
        int totalWaterTrapped = 0;

        int x = height.length - 1;
        int i = 0;

        //  Loop height forward and backward, getting the max height of the left and right walls at each position
        while (i < height.length) {

            //  Forward, get left walls
            if(height[i] > leftHigh) {
                leftHigh = height[i];
            }
            leftWallHighArr[i] = leftHigh;

            //  Backward, get right walls
            if(height[x] > rightHigh) {
                rightHigh = height[x];
            }
            rightWallHighArr[x] = rightHigh;

            //  Iterate i and x
            i++;
            x--;
        }

        //  Loop height
        //  Rainwater trapped is the sum of the min of right and left walls at each position minus the wall height at that position
        for(int y = 0 ; y < height.length ; y++) {
            totalWaterTrapped += (Math.min(leftWallHighArr[y], rightWallHighArr[y]) - height[y]);
        }

        return totalWaterTrapped;
    }

}
