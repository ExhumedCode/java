import java.util.Arrays;

/**
 * Exercise Instructions: Write a Java method that takes an integer array as input and returns a new array that has been
 * rotated to the left by one position. If the input array is {10, 20, 30, 40}, your method should return {20, 30, 40,
 * 10}.
 */

public class ShiftingArraysLeftRotationByOne {

    public static int[] leftByOne(int[] array) {
        // Step 1: Check if the array is empty or has only one element.
        if (array.length <= 1) {
            System.out.println("Array has 0 or 1 element. Nothing to do here.");
            return array;
        }

        // Step 2: Save the first element of the array.
        int firstElement = array[0];

        // Step 3: Create a new array to hold the rotated result.
        int[] leftByOneArray = new int[array.length];

        // Step 4: Use a loop to shift all elements one position to the left.
        for (int i = 1; i < array.length; i++) {
            leftByOneArray[i - 1] = array[i];
        }

        // Step 5: Place the first element at the end of the new array.
        leftByOneArray[leftByOneArray.length - 1] = firstElement;

        // Step 6: Return the rotated array.
        return leftByOneArray;
    }

    public static void main(String[] args) {
        int[] testArray = {10, 20, 30, 40};
        System.out.println("Original array: " + Arrays.toString(testArray));
        int[] finalArray = leftByOne(testArray);
        System.out.println("Array after left rotation by 1: " + Arrays.toString(finalArray));
    }
}