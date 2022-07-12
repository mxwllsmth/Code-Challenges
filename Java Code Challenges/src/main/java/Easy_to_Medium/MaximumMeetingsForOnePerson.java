package Easy_to_Medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaximumMeetingsForOnePerson {

    /*
    Maximum Meetings One Person Can Attend - Takes in two lists that represent that start and end times of meetings during a day -
    Return the most meetings that one person can attend during the day -

    - There is no travel time between meetings and meetings can be attended back to back
    - Doors close on meeting start and end - All meetings must be attended for the full duration
    - Times should be input in 24-hour format to handle AM and PM meetings
    */

    //  Tested in Medium Tests folder

    //  Two methods here - both start and end the same, but have different sort algorithms



    //////////////////////////////////////////////
    //  Method one: Uses a class to house an object that can hold two integers (start and end time) for easy sorting
    //////////////////////////////////////////////



    //  Create meeting class to hold a start and end time for each meeting
    public static class Meeting {

        int startTime;
        int endTime;

        Meeting(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

    }

    public int maxPresentations(List<Integer> scheduleStart, List<Integer> scheduleEnd) {
        //  Handle empty schedule
        if(scheduleStart.size() == 0) {
            return 0;
        }

        int time = 0;
        int meetingsCount = 0;
        List<Meeting> schedule = new ArrayList<>();

        //  Loop and add schedule times
        for(int i = 0; i < scheduleStart.size() ; i++) {
            schedule.add(new Meeting(scheduleStart.get(i), scheduleEnd.get(i)));
        }
        //  Sort schedule by ascending order of end times
        //  Lambda (->) allows access to endTime variable of meeting class to sort by
        schedule.sort(Comparator.comparingInt(i -> i.endTime));
        //  Loop and count meetings that can be attended
        for(Meeting i : schedule) {
            if(time <= i.startTime) {
                time = i.endTime;
                meetingsCount++;
            }
        }
        //  Return count
        return meetingsCount;
    }




    //////////////////////////////////////////////
    //  Method two: Uses a classic swap algorithm to order by one list while maintaining the indexing connection between sister lists
    //////////////////////////////////////////////




    public int maxPresentationsV2(List<Integer> scheduleStart, List<Integer> scheduleEnd) {
        //  Handle empty schedule
        if(scheduleStart.size() == 0) {
            return 0;
        }

        int time = 0;
        int meetingsCount = 0;
        int tempEndVal = 0;
        int tempStartVal = 0;
        Integer[] scheduleStartArray = scheduleStart.toArray(new Integer[0]);
        Integer[] scheduleEndArray = scheduleEnd.toArray(new Integer[0]);

        //  Sort meetings by end time ascending - change start and end times arrays
        //  Start outer loop
        for (int i = 0 ; i < scheduleEndArray.length ; i++) {
            //  Start inner loop
            for (int x = i + 1; x < scheduleEndArray.length ; x++) {
                //  Swap if value at i is greater
                if(scheduleEndArray[i] > scheduleEndArray[x]) {
                    tempEndVal = scheduleEndArray[i];
                    tempStartVal = scheduleStartArray[i];
                    scheduleEndArray[i] = scheduleEndArray[x];
                    scheduleEndArray[x] = tempEndVal;
                    scheduleStartArray[i] = scheduleStartArray[x];
                    scheduleStartArray[x] = tempStartVal;
                }
            }
        }
        //  Loop and count meetings that can be attended
        for(int i = 0 ; i < scheduleEndArray.length ; i++) {
            if(time <= scheduleStartArray[i]) {
                time = scheduleEndArray[i];
                meetingsCount++;
            }
        }
        //  Return count
        return meetingsCount;
    }

}
