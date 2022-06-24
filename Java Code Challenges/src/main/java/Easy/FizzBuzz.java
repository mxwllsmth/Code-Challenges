package Easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    /*
    FizzBuzz - Takes in an array of integers and converts them to an array of strings -
    Return the int if not divisible by 3 or 5, "Fizz" if the int is divisible by 3, "Buzz" if by 5, and "FizzBuzz" if by 3 and 5
     */

    public static List<String> fizzBuzz(int[] numsArr) {
        List<String> stringLi = new ArrayList<>();
        //  Start loop of provided array
        for (int num : numsArr) {
            //  Check if divisible by 3 and 5
            if (num % 3 == 0 && num % 5 == 0) {
                stringLi.add("FizzBuzz");
                //  Check if divisible by 5
            } else if (num % 5 == 0) {
                stringLi.add("Fizz");
                //  Check if divisible by 3
            } else if (num % 3 == 0) {
                stringLi.add("Buzz");
                //  If not divisible by 5 or 3
            } else {
                stringLi.add(String.valueOf(num));
            }
        }
        return stringLi;
    }
}
