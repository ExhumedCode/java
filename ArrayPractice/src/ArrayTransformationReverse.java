/*
Exercise Instructions:
Write a method in Java that takes an array of integers as an input and returns a new array that is the reversed
version of the input. For example:
	•	Input: {1, 2, 3, 4, 5}
	•	Output: {5, 4, 3, 2, 1}

	My solution:

	I created an if statement to handle the case in which an empty array is given, wherein I would have the program
	state that empty array was given and there's nothing to do, and return the given empty array to the user.
	As for the bulk of the logic to reverse the array, read below:

	Approach: I created a function that uses a for loop with an int variable with an initial value equal to the length
	 of the array - 1 (essentially the end point index of the original array) until i is >= 0 (the beginning index of
	 the original array) and decremented down until that condition is met.
	 First I created an empty array named reversed which would hold the result of reversing the array as an empty
	 array of size equal to the original given array.
	 I created an int variable originalIndex to serve as the means to access the original index positions in
	 ascending order as the main i variable goes down in descending order the length of the array.
	 On each decrement of the for loop, reversed[i] will be set to array[originalIndex] and originalIndex will be
	 incremented each time to set the appropriate values of the reversed array.

	 I chose to return a new array so that the original array would still retain it's original order if it would be
	 needed in the future.
 */

import java.util.Arrays;

public class ArrayTransformationReverse {
    public static int[] reverseArray(int[] array) {
        if (array.length == 0) {
            System.out.println("Empty array. Nothing to do here.");
            return array;
        }
        int[] reversed = new int[array.length];
        int originalIndex = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[i] = array[originalIndex];
            originalIndex++;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] finalArray = reverseArray(testArray);
        System.out.println(Arrays.toString(finalArray));
    }
}
