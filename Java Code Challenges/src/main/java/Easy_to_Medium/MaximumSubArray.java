package Easy_to_Medium;

public class MaximumSubArray {

    /*
    Maximum Sub Array - Takes in an integer array and finds the sub array whose elements have the greatest sum -
    Return the greatest sum
    */

    //  Tested in Easy Tests folder

    public int maxSubArray(int[] nums) {
        int maxValue = nums[0];
        int current = 0;
        //  Start loop
        for(int num : nums) {
            //  If current is less than 0, change it to 0
            if(current < 0) {
                current = 0;
            }
            //  Add index to current
            current += num;
            //  Check if current is higher than maxValue
            maxValue = Math.max(current, maxValue);
        }
        return maxValue;
    }
}
