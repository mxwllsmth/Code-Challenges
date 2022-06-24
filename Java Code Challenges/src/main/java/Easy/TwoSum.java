package Easy;

public class TwoSum {

    /*
    Two Sum - Takes in an array of integers and a target value, and finds the two indexes at which the numbers in the array add up to the target -
    Return the two indexes in an array -
    int[]{3,2,3}, 6 ==> int[]{0,2}
    int[]{4,4,5}, 8 ==> int[]{0,1}
    */

    public static int[] twoSum(int[] nums, int target) {

        int[] ans = new int[]{0,0};
        //  Start loop of input array
        for(int i = 0 ; i < nums.length - 1 ; i++) {
            //  Start inner loop of input array from one index past outer loop
            for(int x = i + 1 ; x < nums.length; x++) {
                //  Check if nums add to target
                if (nums[i] + nums[x] == target) {
                    ans[0] = i;
                    ans[1] = x;
                }
            }
        }
        return ans;
    }

}
