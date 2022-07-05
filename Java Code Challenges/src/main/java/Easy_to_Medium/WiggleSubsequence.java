package Easy_to_Medium;

public class WiggleSubsequence {

    /*
    Wiggle Subsequence - Takes in an integer array and returns the length of the longest wiggle subsequence -
    - Wiggle is defined as having the difference between numbers alternate between negative and positive -
    - Arrays with lengths 1 or 2 are wiggle sequences unless the two numbers have a difference of 0 -
    - Subsequence is defined here as removing elements from the array but maintaining order otherwise -
    Return the length of the longest subsequence -
    "[1,7,4,9,2,5]" ==> 6 >>> (6, -3, 5, -7, 3) alternate between positive and negative
    */

    //  Tested in Easy Tests folder

    public int wiggleMaxLength(int[] nums) {
        //  Handle empty arrays
        if(nums.length == 0) {
            return 0;
        }
        int result = 1;
        int i = 1;
        //  Skip initial identical values
        while(i < nums.length && nums[i] == nums[i - 1]) {
            i++;
        }
        //  Return 1 if end of array is reached
        if(i == nums.length) {
            return 1;
        }
        //  Get the state of first two elements difference
        boolean state = nums[i] < nums[i - 1];
        //  Start loop
        for(; i < nums.length ; i++) {
            //  If state of difference for current elements is opposite the state of difference for the previous elements
            if((state && nums[i] < nums[i - 1]) || (!state && nums[i] > nums[i - 1])) {
                //  Increment result and flip state
                result++;
                state = !state;
            }
        }
        return result;
    }

}
