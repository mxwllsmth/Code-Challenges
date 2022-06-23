package Easy;

public class PalindromeNumber {
    /*
    Palindrome Number - Takes in a number and checks to see if that number is a palindrome (the same forwards as backwards) -
    Return true or false -
    (134) ==> false
    (1234321) ==> true
    (-12321) ==> false
    (123321) ==> true
    */
    public static boolean isPalindrome(int x) {

        boolean palindrome = true;
        String newNum = String.valueOf(x);
        int i = 0;

        //Start loop of provided integer through | stop at half point
        while(i <= newNum.length() / 2 ) {
            //Check if the number opposite the current index is a match
            if(newNum.charAt(i) != newNum.charAt(newNum.length() - i - 1)) {
                palindrome = false;
                break;
            } else {
                i++;
            }
        }

        return palindrome;
    }
}
