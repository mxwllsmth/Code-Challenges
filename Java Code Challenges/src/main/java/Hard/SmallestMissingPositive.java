package Hard;

public class SmallestMissingPositive {

    public int firstMissingPositive(int[] nums) {
        //  Start loop to order array sequentially (no nums appear twice)
        for(int i = 0 ; i < nums.length ; i++) {
            //  While current does not equal the next sequential num
            while(nums[i] != i + 1) {
                //  If current is under 0, greater than the array length,
                //  or equals the num at the index of itself minus one (ie the correct index for that number) || STOP
                if(nums[i] <= 0 || nums[i] >= nums.length || nums[i] == nums[nums[i] - 1]) {
                    break;
                }
                //  Perform a switch to place the number where it belongs
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        //  Run loop until the next sequential number is not present
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] != i + 1) {
                return i + 1;
            }
        }
        //  If array contains all sequential nums, return the next num
        return nums.length + 1;
    }

}
