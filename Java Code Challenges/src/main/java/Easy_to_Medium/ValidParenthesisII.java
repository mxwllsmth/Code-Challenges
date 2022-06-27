package Easy_to_Medium;

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

        Stack<Character> leftParenthesis = new Stack<>();
        //  Start loop
        for(char current : s.toCharArray()) {
            //  Handle left parenthesis
            if(current == '[' || current == '{' || current == '(') {
                leftParenthesis.push(current);
                //  Handle right parenthesis
            } else if((!leftParenthesis.isEmpty() && current == ']' && leftParenthesis.peek() == '[')  ||
                    (!leftParenthesis.isEmpty() && current == '}' && leftParenthesis.peek() == '{') ||
                    (!leftParenthesis.isEmpty() && current == ')' && leftParenthesis.peek() == '(')) {
                leftParenthesis.pop();
            } else {
                //  Return false when no cases are a match
                return false;
            }
        }
        //  Check if stack created is empty
        return leftParenthesis.isEmpty();
    }
}
