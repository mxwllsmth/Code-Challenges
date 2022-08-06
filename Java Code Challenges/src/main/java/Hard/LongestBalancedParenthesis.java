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

    // Note - not my best work - easy to break with consecutive ((( or ))) between sets of balanced parenthesis

    public String longestBalanced(String strArgs) {
        String current = "";
        String result = "";
        int counter = 0;
        int subRight;
        int subLeft;
        //  Chop left parenthesis off the far end
        while(strArgs.charAt(strArgs.length() - 1) == '(') {
            strArgs = strArgs.substring(0, strArgs.length() - 1);
        }
        // Start loop
        for(int i = 0; i < strArgs.length(); i++) {
            //  If left symbol and at beginning
            if( i == 0 && strArgs.charAt(i) == '(') {
                current += strArgs.charAt(i);
                counter++;
                //  If right symbol at beginning | Chop symbol off the close end
            } else if ( (i == 0 && strArgs.charAt(i) == ')') ||
                    (i == strArgs.length() - 1 && strArgs.charAt(i) == '(') ) {
                continue;
                //  If right symbol and left symbols exist already, decrement counter, track symbol
            } else if (strArgs.charAt(i) == ')' && counter > 0) {
                current += strArgs.charAt(i);
                counter--;
                //  If left symbol, increment counter, track symbol
            } else if (strArgs.charAt(i) == '(' && ((strArgs.length() - 1) - i) >= counter) {
                current += strArgs.charAt(i);
                counter++;
                subRight = 0;
                subLeft = 0;
                //  Start loop and check for remaining right and left symbols
                for (int x = i + 1; x < strArgs.length(); x++) {
                    if (strArgs.charAt(x) == ')') {
                        subRight++;
                    } else {
                        subLeft++;
                    }
                }
                //  Check if remaining symbols are balanced and decrement counter if so | reset current
                if(subRight == subLeft) {
                    current = "";
                    counter--;
                    //  If unbalanced, jump back one index and reset counter and current
                } else if (subRight < counter ||
                        (subRight == counter && strArgs.substring(i + 1).length() - 1 == counter && i != strArgs.length() - 1 - i)) {
                    i --;
                    counter = 0;
                    current = "";
                }
                //  If right symbol reset counter and current
            } else if (strArgs.charAt(i) == ')') {
                counter = 0;
                current = "";
            }
            //  If current is longer than the result, set result to current
            if (current.length() > result.length() && counter == 0) {
                result = current;
            }
        }

        return result;
    }

}
