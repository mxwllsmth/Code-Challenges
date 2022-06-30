package Easy_to_Medium;

import java.util.Objects;
import java.util.Stack;

public class ValidParenthesisII {

    /*
    Valid Parenthesis II - Takes in a string of parenthesis including {} [] () and returns boolean for validity -
    Return true when valid and false when invalid -
    "{}[]()" ==> true
    "({[[[]]})" ==> true
    "{}[)" ==> false
    "()}" ==> false
    */

    //  Tested in Easy Tests folder

    public boolean validParenthesis(String s) {
        Stack<Character> leftSymbols = new Stack<>();
        //  Check for uneven number of symbols
        if(s.length() % 2 != 0) {
            return false;
        }
        //  Check for empty string
        if(s.length() == 0) {
            return true;
        }
        //  Start loop
        for(char i : s.toCharArray()) {
            //  Check for left symbols and add to stack
            if(Objects.equals(i, '(') || Objects.equals(i, '[') || Objects.equals(i, '{')) {
                leftSymbols.push(i);
                //  Check for right symbols if the stack is not empty
            } else if(!leftSymbols.isEmpty()) {
                //  If both conditions are true, pop one left parenthesis off stack
                if(Objects.equals(i, ')') && leftSymbols.peek() == '(' ||
                        Objects.equals(i, ']') && leftSymbols.peek() == '[' ||
                            Objects.equals(i, '}') && leftSymbols.peek() == '{') {
                    leftSymbols.pop();
                    //  If no cases are a match, return false
                } else {
                    return false;
                }
            }
        }
        //  Return true if stack is empty, false if not
        return leftSymbols.isEmpty();
    }




















}




































