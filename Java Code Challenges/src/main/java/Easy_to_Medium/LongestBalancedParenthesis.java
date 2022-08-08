package Easy_to_Medium;

public class LongestBalancedParenthesis {

    /*
    Longest Balanced Parenthesis - Takes in a string of parenthesis - only '(' and ')' - and finds the longest set of balanced (valid) parenthesis -
    Return the longest set -
    */

    //  Tested in Easy test folder

    public String getLongestSetOfBalancedParenthesis(String strArgs) {
        String longest = "";
        StringBuilder current = new StringBuilder();
        int count = 0;

        //  Start loop
        for(int i = 0 ; i < strArgs.length() ; i++) {
            //  Reset current and count for each outer loop pass
            current = new StringBuilder(String.valueOf(strArgs.charAt(i)));
            count = 0;
            //  If right symbol, decrement counter
            if(strArgs.charAt(i) == ')') {
                count--;
            //  If left symbol, increment counter
            } else {
                count++;
            }
            //  If count drops under 0, STOP
            if(count < 0) {
                continue;
            }
            //  Start inner loop from the next char
            for(int x = i + 1 ; x < strArgs.length() ; x++) {
                //  If right symbol, decrement counter
                if(strArgs.charAt(x) == ')') {
                    count--;
                    //  If count is greater than or equal to 0, add symbol to current
                    if(count >= 0) {
                        current.append(')');
                    //  If count is under 0, STOP
                    } else {
                        break;
                    }
                //  If left symbol, increment counter and symbol to current
                } else {
                    count++;
                    current.append('(');
                }
                //  If count is equal to 0 AND the length of 'current' is greater than 'longest', update 'longest' to 'current'
                if(count == 0 && current.length() > longest.length()) {
                    longest = current.toString();
                }
            }
        }
        return longest;
    }




    /*
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

    Just keeping this in here for fun :)
    This was my original solution to the problem... haha

    The code works for a good amount of cases, but can be easily broken with repeating '(' or ')' a couple of times

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    */
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
