/*
Array Manipulation Program

This program demonstrates two fundamental array operations:
1. Subarray Extraction: Extracts a portion of an array between specified indices
2. Array Merging: Combines two arrays into a single array

Functionality:
- subArrayExtraction(): Creates a new array containing elements from a specified range
    - Parameters: source array, start index, end index (inclusive)
    - Returns empty array if indices are invalid (start < 0, end >= array length, or start > end)
    - Example: {10, 20, 30, 40, 50} with start=1, end=3 returns {20, 30, 40}

- mergeArrays(): Combines two arrays sequentially
    - Parameters: two source arrays
    - Returns: single array containing all elements from both input arrays
    - Example: {1, 2, 3} and {4, 5, 6} returns {1, 2, 3, 4, 5, 6}
*/

import java.util.Arrays;
import java.util.Scanner;

public class ExtractingAndMergingSubarrays {
    public static int[] subArrayExtraction(int[] array, int start, int end) {
        // Validate input parameters to ensure they are within array bounds
        if (start < 0 || end >= array.length) {
            int[] emptyArray = new int[0];
            return emptyArray; // Return empty array if indices are invalid
        }

        // Calculate size for extracted array (inclusive of both start and end indices)
        // Add 1 since we include both endpoints (e.g., start=1, end=3 needs 3 elements)
        int extractedArrayLength = end - start + 1;

        // Create a new array with exactly enough space for the extracted elements
        // The size is determined by extractedArrayLength calculated above
        int[] extractedArray = new int[extractedArrayLength];

        // Initialize index to track position in the new array as we copy elements
        // This will increment from 0 to (extractedArrayLength-1) as we populate the
        // array
        int extractedArrayIndex = 0; // Tracks position in new array

        // Copy elements from source array to extracted array
        for (int i = start; i <= end; i++) {
            extractedArray[extractedArrayIndex] = array[i];
            extractedArrayIndex++;
        }
        return extractedArray;
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        // Create new array large enough to hold both input arrays
        int[] mergedArray = new int[array1.length + array2.length];
        int array1Index = 0;
        int array2Index = 0;

        // Copy all elements from first array
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[array1Index];
            array1Index++;
        }

        // Copy all elements from second array, starting where first array ended
        for (int i = array1.length; i < mergedArray.length; i++) {
            mergedArray[i] = array2[array2Index];
            array2Index++;
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        // Test data for demonstration
        int[] testArray = { 10, 20, 30, 40, 50 };
        int testStart = 1;
        int testEnd = 3;
        int[] merge1 = { 1, 2, 3 };
        int[] merge2 = { 4, 5, 6 };

        // Demonstrate subarray extraction
        System.out.println("Original array: " + Arrays.toString(testArray));
        int[] extracted = subArrayExtraction(testArray, testStart, testEnd);
        System.out.println(
                "Extracted array with start position of 1 and end position of 3: " + Arrays.toString(extracted));

        // Demonstrate array merging
        System.out.println("Pre-merged arrays: \n" + Arrays.toString(merge1) + "\n" + Arrays.toString(merge2));
        int[] merged = mergeArrays(merge1, merge2);
        System.out.println("Merge of the two prior arrays: " + Arrays.toString(merged));
    }
}
