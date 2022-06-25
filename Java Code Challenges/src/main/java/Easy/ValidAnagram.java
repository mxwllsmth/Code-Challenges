package Easy;

import java.util.ArrayList;
import java.util.List;

public class ValidAnagram {

    /*
    Valid Anagram - Takes in two strings and checks to see if the letters of one string can be used to write the other -
    - Each letter must be used once -
    Return true for valid or false for invalid -
    "car" "rat" = false
    "rat" "tar" = true
    "hola" "halo" = true
    "try" "tryy" = false
    */

    //  Tested in Easy Tests folder

    public boolean isAnagram(String s, String t) {

        //  Check for differing lengths
        if(s.length() != t.length()) {
            return false;
        }
        //  Create an int array the size of the alphabet (all 0s)
        int[] alphaArr = new int[26];
        //  Start loop
        for(int i = 0 ; i < s.length() ; i++) {
            //  Get the numeric position of a character in the alphabet - 'a' = 0 & 'z' = 25
            //  Increment for characters encountered in s, decrement for characters encountered in t
            alphaArr[s.charAt(i) - 'a'] ++;
            alphaArr[t.charAt(i) - 'a'] --;
        }
        //  Start loop
        //  Check to see if all elements in the alphaArr are 0
        for(int num: alphaArr){
            if(num != 0) {
                return false;
            }
        }
        return true;
    }
}
