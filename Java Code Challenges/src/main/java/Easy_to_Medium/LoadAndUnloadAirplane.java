package Easy_to_Medium;

import java.util.*;

public class LoadAndUnloadAirplane {

    /*
    Load And Unload Airplane - You are tasked with writing a program to take bags on a conveyor belt, add them to containers, and add the containers to an airplane -
    - Bags are input as a string separated by commas - each bag is an integer representing the weight of the bag
    - Containers are unloaded in first-in-first-out order
    - The airplane is unloaded in last-in-first-out order
    - Containers have a max weight of 40lbs
    Return a string separated by commas of the bags after unloading
     */

    public String loadAndUnloadBags(String bags) {

        String[] bagsArr = bags.split(",");
        String unloadedBags = "";
        int weight = 0;
        Stack<Queue<Integer>> airplane = new Stack<>();
        Queue<Integer> container = new LinkedList<>();

        //  Loop bags array
        for(int i = 0 ; i < bagsArr.length ; i++) {
            int x = Integer.parseInt(bagsArr[i]);
            //  If weight is zero
            if(weight == 0) {
                //  New container
                container = new LinkedList<>();
            }
            //  If weight plus bag is under 40 lbs
            if(weight + x <= 40) {
                //  Increase weight and add bag to container
                weight += x;
                container.add(x);
                //  If at the last bag
                if(i == bagsArr.length - 1) {
                    //  Add container to airplane
                    airplane.push(container);
                }
            //  If overweight
            } else {
                //  Add container to airplane, reset weight, go back one index
                airplane.push(container);
                weight = 0;
                i--;
            }
        }
        //  While the airplane is not empty
        while(!airplane.isEmpty()) {
            //  Loop through each container
            for(Integer i : airplane.pop()) {
                //  Add current bag to output string
                unloadedBags += i.toString() + ",";
            }
        }
        //  Remove trailing comma and return
        unloadedBags = unloadedBags.substring(0, unloadedBags.length() - 1);
        return unloadedBags;
    }

}
