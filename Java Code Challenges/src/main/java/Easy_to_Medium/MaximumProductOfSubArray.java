package Easy_to_Medium;

public class MaximumProductOfSubArray {

    public Integer maxProductOfSubArray(int[] nums) {

        //Handle empty array
        if(nums.length == 0) {
            return 0;
        }

        int maxSum = nums[0];
        int current;

        //  Start outer loop of nums
        for(int i = 0 ; i < nums.length ; i++) {
            //  Track current number
            current = nums[i];
            //  If current is larger than maxSum, update maxSum
            maxSum = Math.max(maxSum, current);
            //  If current is 0 STOP
            if(current == 0) {
                continue;
            }
            //  Start inner loop from the next num
            for(int x = i+1 ; x < nums.length ; x++) {
                //  Multiply current
                current *= nums[x];
                //  If current is larger than maxSum, update maxSum
                maxSum = Math.max(maxSum, current);
                //  If current is 0 STOP
                if(current == 0) {
                    break;
                }
            }
        }
        return maxSum;
    }
}
