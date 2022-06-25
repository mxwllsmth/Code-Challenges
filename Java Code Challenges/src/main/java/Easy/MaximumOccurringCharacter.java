package Easy;

public class MaximumOccurringCharacter {

    /*
    Maximum Occurring Character - Takes in a string and finds the character that appears the most (ties are settles by which character appeared first) -
    Return the character -
    (15534) ==> 5
    (rosepetals) ==> s
    (helloworld) ==> l
    (46628944428) ==> 4
    */

    //  Tested in Easy Tests folder

    public char maximumOccurringCharacter(String text) {

        char mostOccurring = text.charAt(0);
        int highCount = 0;
        int count = 0;

        //  Start outer loop of input string
        for(int i = 0; i < text.length() - 1; i++) {

            count = 0;
            //  Start inner loop of input string
            for(int x = 0; x < text.length() - 1; x++) {
                //  Check each character in the inner loop for a match with the character at the current index of the outer loop
                if(text.charAt(x) == text.charAt(i)) {
                    count++;
                }

            }
            //  Check if character is the most occurring
            if(count > highCount) {
                highCount = count;
                mostOccurring = text.charAt(i);
            }
        }
        return mostOccurring;
    }
}
