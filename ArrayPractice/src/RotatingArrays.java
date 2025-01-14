import java.util.Arrays;

/*
Write a method that takes an array of integers and an integer k as input and rotates the array to the right by k
positions.
For example:
	•	Input: array = {1, 2, 3, 4, 5}, k = 2
	•	Output: {4, 5, 1, 2, 3}

If k is greater than the length of the array, you should “wrap around” by reducing k to k % array.length (this
ensures it works efficiently).

Note:
1.	Understanding Rotation:
When rotating an array to the right:
	•	The last k elements of the array move to the front.
	•	The remaining elements are shifted to the right.

If k is greater than the array’s length, k % array.length gives you the effective rotation (e.g., rotating by 7 in an
 array of length 5 is equivalent to rotating by 2).
 */
public class RotatingArrays {
    public static int[] extractMergeAndShift(int[] array, int k) {
        int extractedArrayLength = k;
        int[] extractedArray = new int[extractedArrayLength];
        int extractedArrayIndex = 0; // Tracks position in new array

        // Copy elements from source array to extracted array
        for (int i = array.length - k; i < array.length; i++) {
            extractedArray[extractedArrayIndex] = array[i];
            extractedArrayIndex++;
        }
        // Now we need to create a new array that is the length of the original array to
        // be used to store extracted k elements
        // to be placed at the beginning of the array, and shift the remaining elements
        // to the right
        int[] rotatedArray = new int[array.length];
        // First, copy the extracted elements to the start of rotatedArray
        for (int i = 0; i < k; i++) {
            rotatedArray[i] = extractedArray[i];
        }

        // Now copy the remaining elements from the original array
        for (int i = 0; i < array.length - k; i++) {
            rotatedArray[i + k] = array[i];
        }

        return rotatedArray;
    }

    public static void main(String[] args) {
        int[] testArray = { 1, 2, 3, 4, 5 };
        int steps = 2;
        System.out.println("Original array: " + Arrays.toString(testArray));
        System.out.println("Rotated array: " + Arrays.toString(extractMergeAndShift(testArray, steps)));

    }
}