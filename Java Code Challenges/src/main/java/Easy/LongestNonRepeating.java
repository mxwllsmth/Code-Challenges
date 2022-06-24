package Easy;

public class LongestNonRepeating {
    /*
    Longest Non-Repeating SubString - Takes in a string and finds the longest sub-string without a repeating character -
    Return the substring found and its length (if multiple substrings of the same length exist, the first will be returned) -
    abcabcbb = abc : 3
    bbbbbb = b : 1
    "" = "" : 0
    pwwketw = wket : 3
    */
    public static String longestSubstring(String inputStr) {
        String output = "";
        String possible = "";

        //  Start loop over provided string
        for (int i = 0; i < inputStr.length() - 1; i++) {
            //  Check if the possible longest string contains the char at the current index
            if (!possible.contains(String.valueOf(inputStr.charAt(i)))) {
                possible += String.valueOf(inputStr.charAt(i));
                //  Starts loop from current index and resets possible output
            } else {
                i--;
                possible = "";
            }
            //  Checks if the possible output is longer than the current output
            if (possible.length() > output.length()) {
                output = possible;
            }
        }
        //  Format
        output += " : " + output.length();

        return output;
    }
}
