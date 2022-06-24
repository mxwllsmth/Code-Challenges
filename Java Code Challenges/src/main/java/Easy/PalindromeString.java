package Easy;

public class PalindromeString {

    /*
    Valid Palindrome - Takes in a string and checks to see if it a valid palindrome -
    - palindrome is defined as the string being the same forward and backward while only considering alphanumeric characters (ignoring case) -
    Return true for valid palindromes, false for invalid
    "Ta,c oc at" ==> True
    "tacocat" ==> True
    "taco : cat" ==> True
    "Taco0cat" ==> False
    */

    public boolean isPalindrome(String s) {
        boolean palindrome = true;
        int i = 0;
        //  Filter string to only letters and numbers
        String filteredS = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        //  Check for single charater or no characters
        if(filteredS.length() <= 1) {
            return palindrome;
        }

        //  Start loop of provided string | stop at half point
        while(i < filteredS.length() / 2 ) {
            //  Check if the letter/number opposite the current index is a match
            if(filteredS.charAt(i) != filteredS.charAt(filteredS.length() - i - 1)) {
                palindrome = false;
                break;
            } else {
                i++;
            }
        }
        return palindrome;
    }
}
