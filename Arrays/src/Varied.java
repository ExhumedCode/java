public class Varied {
    public static double printMax(double... numbers) {
        if (numbers.length == 0) { // Check if no arguments are passed
            System.out.println("No arguments passed!");
            return Double.MIN_VALUE;
        }

        double max = numbers[0]; // Assume the first number is the max
        for (int i = 1; i < numbers.length; i++) { // Start from the second element
            if (numbers[i] > max) { // Update max if a larger number is found
                max = numbers[i];
            }
        }

        System.out.println("The max number is " + max); // Print the max
        return max; // Return the max value after the loop finishes
    }

    public static void main(String[] args) {
        printMax(3, 6, 9, 7, 34, 56, 78, 1); // Call with varargs
        printMax(new double[] {4, 6, 8}); // Call with an explicit array
    }
}