package Easy;

public class RunLength {

    /*
    Run Length - take a string and condense it into the number of times a character repeats
    in a row - input "aabbcde" should return "2a2b1c1d1e"
     */

    public static String runLength(String str) {

        String condensedString = "";
        int count;
        //  Start loop of provided string
        for (int i = 0; i < str.length(); i++) {
            count = 1;
            //  Start inner loop to track repeating characters from current index
            while (i < str.length() - 1 && (str.charAt(i) == str.charAt(i + 1))) {
                i++;
                count++;
            }
            //  Format
            condensedString += String.valueOf(count) + str.charAt(i);
        }
        return condensedString;
    }
}
