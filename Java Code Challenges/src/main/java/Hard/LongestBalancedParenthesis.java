package Hard;

public class LongestBalancedParenthesis {
    /*
    Longest Balanced - Takes in a string of parenthesis and finds the longest set of balanced (valid) parenthesis -
    Return the longest set -
    )(())) = (())
    ())()()(()) = ()()(())
    )( = ""
    ((()) = (())
    ((()() = ()()
    ()(() = ()
    */
    public static String longestBalanced(String strArgs) {
        String current = "";
        String result = "";
        int counter = 0;
        int subRight;
        int subLeft;

        while(strArgs.charAt(strArgs.length() - 1) == '(') {
            strArgs = strArgs.substring(0, strArgs.length() - 1);
        }

        for(int i = 0; i < strArgs.length(); i++) {
            if( i == 0 && strArgs.charAt(i) == '(') {
                current += strArgs.charAt(i);
                counter++;
            } else if ( (i == 0 && strArgs.charAt(i) == ')') ||
                    (i == strArgs.length() - 1 && strArgs.charAt(i) == '(') ) {
                continue;
            } else if (strArgs.charAt(i) == ')' && counter > 0) {
                current += strArgs.charAt(i);
                counter--;
            } else if (strArgs.charAt(i) == '(' && ((strArgs.length() - 1) - i) >= counter) {
                current += strArgs.charAt(i);
                counter++;
                subRight = 0;
                subLeft = 0;
                for (int x = i + 1; x < strArgs.length(); x++) {
                    if (strArgs.charAt(x) == ')') {
                        subRight++;
                    } else {
                        subLeft++;
                    }
                }
                if(subRight == subLeft) {
                    current = "";
                    counter--;
                } else if (subRight < counter ||
                        (subRight == counter && strArgs.substring(i + 1).length() - 1 == counter && i != strArgs.length() - 1 - i)) {
                    i --;
                    counter = 0;
                    current = "";
                }
            } else if (strArgs.charAt(i) == ')') {
                counter = 0;
                current = "";
            }

            if (current.length() > result.length() && counter == 0) {
                result = current;
            }
        }

        return result;
    }

}
