public class ReverseArray {

    public static int[] reverseArray(int[] inputArray) {
        int length = inputArray.length;
        int[] reversedArray = new int[length];

        for (int i = 0, j = length - 1; i < length; i++, j--) {
            reversedArray[j] = inputArray[i];
        }
        return reversedArray;
    }

    private static void printArray(int[] array) {
        System.out.print("Reversed list: ");
        for (int number : array) {
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        int[] originalArray = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] reversedArray = reverseArray(originalArray);
        printArray(reversedArray);
    }
}
