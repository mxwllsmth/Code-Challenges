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

    //  Tested in Medium Tests folder

    public int maxTickets(List<Integer> tickets) {
        //  Check if tickets exist
        if(tickets.size() < 1) {
            return 0;
        }
        //  Initialize result at 1 - always a valid ticket string of at least 1 at this point
        int result = 1;
        int counter = 0;
        int startVal = 0;
        boolean again = false;
        //  Sort tickets numerically
        Collections.sort(tickets);
        //  Start loop
        for(int i = 0; i < tickets.size(); i++) {
            //  Check if looping again | set i to start val, reset counter, reset again bool
            if(again) {
                i = startVal;
                again = false;
                counter = 0;
            }
            //  Get current integer
            int numAtI = tickets.get(i);
            int numAtIPlusOne = 0;
            //  If in bounds get next integer
            if( i < tickets.size() - 1) {
                numAtIPlusOne = tickets.get(i + 1);
            }
            //  If the value at the next index is equal to or is one greater than the value at the current index, increment counter
            if(numAtI == numAtIPlusOne ||
                    numAtI == numAtIPlusOne - 1) {
                counter++;
            }
            //  If the next value is not a match for continuing building the ticket string
            else {
                //  Check if the counter is greater than the current result
                if(counter > result) {
                    result = counter;
                }
                //  Set again bool to true and set start value to the next index
                again = true;
                startVal = i + 1;
                continue;
            }

        }
        //  When loop terminates | Check if counter is greater than the current result
        if(counter > result) {
            result = counter;
        }
        return result;
    }
}
