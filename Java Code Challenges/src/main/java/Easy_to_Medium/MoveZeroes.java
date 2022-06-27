package Easy_to_Medium;

public class MoveZeroes {

    /*
    Move Zeroes - Takes in an integer array and moves all zeroes to the end (maintaining order otherwise) -
    Return the shifted array
    */

    //  Zeroes cn be shifted to the beginning of the array by looping backwards

    //  Tested in Easy Tests folder

    public int[] moveZeroes(int[] nums) {
        int counter = 0;
        //  Start loop
        for(int i = 0 ; i < nums.length ; i++) {
            //  If num does not equal 0
            if(nums[i] != 0) {
                //  Set nums at counter to nums at i and increment counter
                nums[counter] = nums[i];
                counter++;
            }
        }
        //  Start loop at counter and update all remaining elements to 0
        for(int i = counter ; i < nums.length ; i++) {
            nums[i] = 0;
        }
        return nums;
    }

}

