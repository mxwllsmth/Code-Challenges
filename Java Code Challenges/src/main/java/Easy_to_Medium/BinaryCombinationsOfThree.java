package Easy_to_Medium;

public class BinaryCombinationsOfThree {

    /*
    Binary Combinations Of Three - Takes in an array of binary values and finds how many combinations can be made of alternating sets of three values -
    - For the combinations : values that appear later in the original string cannot appear before a value that came before it -
    "00101010111" ==>
                      010 appears 15 times
                      101 appears 23 times
                                           ==> 38 total combinations possible

    "01011" ==>
                010 appears 1 time
                101 appears 2 times
                                   ==> 3 total combinations possible
     */

    //  Tested in Medium tests folder

    public int getBinaryCombinationsOfThree(int[] nums) {

        int combinations = 0;
        int y = 0;
        //  Start outer loop and get first num for sequence
        for(int i = 0 ; i < nums.length ; i++) {
            //  Start inner loop and get second num for sequence
            for(int x = i + 1 ; x < nums.length ; x++) {
                //  If the second num is not equal to the first
                if(nums[x] != nums[i]) {
                    //  Set loop start point
                    y = x + 1;
                    //  While in bounds, run inner loop and get third num for sequence
                    while(y < nums.length) {
                        //  If the third num equals the first num
                        if(nums[y] == nums[i]) {
                            //  Count
                            combinations++;
                        }
                        //  Iterate loop
                        y++;
                    }
                }
            }
        }
        return combinations;
    }

}
