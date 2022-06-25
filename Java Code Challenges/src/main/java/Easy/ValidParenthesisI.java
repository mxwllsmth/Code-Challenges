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

    //  Tested in Easy Tests folder

    public Boolean balanced(String stringArg) {
        int counter = 0;
        boolean balanced = true;
        //  Start Loop
        for(int i = 0; i < stringArg.length(); i++) {
            //  If right symbol is encountered
            if (stringArg.charAt(i) == ')') {
                counter += 1;
                if(counter > 0) {
                    balanced = false;
                }
                //  If left symbol is encountered
            } else if(stringArg.charAt(i) == '('){
                counter -= 1;
            }
        }
        //  Check if counter is balanced at 0
        if(counter != 0) {
            balanced = false;
        }
        return balanced;
    }
}
