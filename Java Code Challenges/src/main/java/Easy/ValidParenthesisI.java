package Easy;

public class ValidParenthesisI {
    /*
    Valid Parenthesis I - Takes in a string of parenthesis and checks to see if the parenthesis are balanced (valid) -
    Return true or false -
    (()) = true
    () = true
    "" = true
    )( = false
    ((()) = false
    */
    public static Boolean balanced(String stringArg) {
        int counter = 0;
        boolean balanced = true;

        for(int i = 0; i < stringArg.length(); i++) {
            if (stringArg.charAt(i) == ')') {
                counter += 1;
                if(counter > 0) {
                    balanced = false;
                }
            } else if(stringArg.charAt(i) == '('){
                counter -= 1;
            }
        }
        if(counter != 0) {
            balanced = false;
        }
        return balanced;
    }
}
