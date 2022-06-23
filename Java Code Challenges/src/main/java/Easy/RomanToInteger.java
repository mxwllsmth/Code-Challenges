package Easy;

public class RomanToInteger {
    /*
    Roman To Integer - Takes in a roman numeral and converts it to an int
    Should be able to take in roman numerals I, V, X, L, C, D, and M
     */
    public static int romanToInt(String roman) {
        int sum = 0;
        //Start loop of provided string
        for (int i = 0; i < roman.length(); i++) {
            //Check case 1 for I
            if (i < roman.length() - 1 && roman.charAt(i) == 'I' && roman.charAt(i + 1) == 'V') {
                sum += 4;
                i++;
                //Check case 2 for I
            } else if (i < roman.length() - 1 && roman.charAt(i) == 'I' && roman.charAt(i + 1) == 'X') {
                sum += 9;
                i++;
                //Check case 3 for I
            } else if (roman.charAt(i) == 'I') {
                sum += 1;
                //Check case 4 for I
            } else if (roman.charAt(i) == 'V') {
                sum += 5;
                //Check case 1 for X
            } else if (i < roman.length() - 1 && roman.charAt(i) == 'X' && roman.charAt(i + 1) == 'L') {
                sum += 40;
                i++;
                //Check case 2 for X
            } else if (i < roman.length() - 1 && roman.charAt(i) == 'X' && roman.charAt(i + 1) == 'C') {
                sum += 90;
                i++;
                //Check case 3 for X
            } else if (roman.charAt(i) == 'X') {
                sum += 10;
                //Check case 1 for C
            } else if (i < roman.length() - 1 && roman.charAt(i) == 'C' && roman.charAt(i + 1) == 'D') {
                sum += 400;
                i++;
                //Check case 2 for C
            } else if (i < roman.length() - 1 && roman.charAt(i) == 'C' && roman.charAt(i + 1) == 'M') {
                sum += 900;
                i++;
                //Check case 1 for L
            } else if (roman.charAt(i) == 'L') {
                sum += 50;
                //Check case 3 for C
            } else if (roman.charAt(i) == 'C') {
                sum += 100;
                //Check case 1 for D
            } else if (roman.charAt(i) == 'D') {
                sum += 500;
                //Check case 1 for M
            } else if (roman.charAt(i) == 'M') {
                sum += 1000;
            }
        }
        return sum;
    }
}
