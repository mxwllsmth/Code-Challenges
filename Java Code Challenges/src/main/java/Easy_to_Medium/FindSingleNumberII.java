package Easy_to_Medium;

import java.util.Arrays;

public class FindSingleNumberII {

    /*
    Find Single Number II - Takes in an integer array where every number appears three times except one number appears once.
    - Return the number that appears one time
     */

    //  Tested in Easy test folder

    public int singleNumber(int[] nums) {
        //  Sort the array
        Arrays.sort(nums);

        int i = 0;
        //  Start loop
        while (i < nums.length - 1) {
            //  Check if the next number is equal to the current
            if (nums[i] != nums[i + 1]) {
                //  Return current if not equal to next
                return nums[i];
            }
            //  Iterate i by 3 to skip over the group
            i += 3;
        }
        //  Return the last number if the single number has not yet been found
        return nums[nums.length - 1];
    }

}
