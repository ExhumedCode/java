/*
 * Write a method in Java that takes an array of integers as input and returns the maximum integer found in that
 * array. For example, if the input array is {3, 8, 2, 7}, the method should return 8.

 */

public class ArrayBasicsAndIndexing {
    public static int findMax(int[] array) {
        if (array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = {3, 8, 2, 7};
        int max = findMax(numbers);
        System.out.println(max);
    }
}
