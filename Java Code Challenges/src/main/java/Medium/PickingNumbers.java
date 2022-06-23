package Medium;

import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    /*
    Picking Numbers - Takes in a list of integers (ticket numbers) and finds the
    longest string of ticket numbers where the next number is equal to or is the next sequential number of the current ticket number -
    Return the length of the longest valid string of tickets -
    (1,1,1,2,2,5,6,7,8,9,10,11) ==> 7
    (1,1,1,2,2,6,7) ==> 5
    */
    public static int maxTickets(List<Integer> tickets) {

        int result = 0;
        int counter = 0;
        int startVal = 0;
        boolean again = false;

        Collections.sort(tickets);

        for(int i = 0; i < tickets.size(); i++) {

            if(again) {
                i = startVal;
                again = false;
                counter = 0;
            }

            int numAtI = tickets.get(i);
            int numAtIPlusOne = 0;

            if( i < tickets.size() - 1) {
                numAtIPlusOne = tickets.get(i + 1);
            }

            if(numAtI == numAtIPlusOne ||
                    numAtI == numAtIPlusOne - 1) {
                counter++;
            }
            else {
                if(counter > result) {
                    result = counter;
                }
                again = true;
                startVal = i + 1;
                continue;
            }

        }

        if(counter > result) {
            result = counter;
        }
        result += 1;
        return result;
    }
}
