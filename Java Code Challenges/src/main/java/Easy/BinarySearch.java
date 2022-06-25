package Easy;

import java.util.Arrays;

public class BinarySearch {

    /*
    Binary Search - Takes in an integer array and a target integer, and finds the target integer in the array -
    Return the index of the target integer if it exists, or -1 if it does not
     */

    //  Tested in Easy Tests folder

    public int search(int[] nums, int target) {

        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
