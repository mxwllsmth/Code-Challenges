package Easy;

public class RotateArrayKSteps {
    /*
    Rotate Array - Takes in a number of steps and an array and rotates the array to the right by the number of steps -
    Return the rotated array -
    [1,2,3,4,5,6,7], steps = 3 ==> [5,6,7,1,2,3,4]
    [1,2], steps = 3 ==> [2, 1]
    [-1], steps = 2 ==> [-1]
    */
    public static void rotateArray(int[] input, int steps) {

        int[] rotated = new int[input.length];

        //  Reduce steps when over input length to reduce full cycles
        if(steps > input.length) {
            steps = steps % input.length;
        }
        //  Loop over input array for number of steps
        for (int i = 0; i < steps; i++) {
            rotated[i] = input[input.length - (steps - i)];
        }
        //  Loop over input array for length minus steps
        for (int i = 0; i < input.length - steps; i++) {
            rotated[steps + i] = input[i];
        }
        //  Loop over input array and chage each index to match the rotated array
        for (int i = 0; i < input.length; i++) {
            input[i] = rotated[i];
        }
    }
}
