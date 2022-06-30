package Easy_to_Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianOfTwoSortedArrays {

    /*
    Median Of Two Sorted Arrays - Takes in two sorted arrays, merges them, and finds the median -
    Return the median
    */

    //  Tested in Easy Tests folder

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        List<Integer> mergedArrList = new ArrayList<>(nums1.length + nums2.length);
        //  Merge and sort the two arrays
        for(int num : nums1) {
            mergedArrList.add(num);
        }
        for(int num : nums2) {
            mergedArrList.add(num);
        }
        Collections.sort(mergedArrList);
        //  Get median of list if length is odd
        if(mergedArrList.size() % 2 != 0) {
            median = mergedArrList.get((mergedArrList.size() - 1) / 2);
            //  Get median of list if length is even
        } else {
            median = (Double.parseDouble((mergedArrList.get((mergedArrList.size() / 2) - 1)).toString())
                    +
                    Double.parseDouble((mergedArrList.get(mergedArrList.size() / 2)).toString())) / 2;
        }
        return median;
    }

}
