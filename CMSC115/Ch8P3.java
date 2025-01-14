/*
 * Nelson Villatoro
 * CMSC115
 * Chapter 8 Project 3
 * 12/03/2024
 * 
 * This program finds the location of the largest element in a two-dimensional array.
 * It includes a method locateLargest() that returns a one-dimensional array
 * containing the row and column indices of the largest element.
 * 
 * If there are multiple largest elements, the method returns the indices
 * of the first occurrence (smallest row index, then smallest column index).
 * 
 * The program prompts the user to enter the array dimensions and elements,
 * then displays the location of the largest value.
 */
public class Ch8P3 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Add welcome message and instructions
        System.out.println("\n=== Largest Array Element Finder ===");
        System.out.println("This program will help you find the largest value in a 2D array\n");

        // Get dimensions with input validation
        int rows = 0, cols = 0;
        do {
            System.out.print("Enter the number of rows (positive number): ");
            while (!input.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                input.next();
            }
            rows = input.nextInt();
        } while (rows <= 0);

        do {
            System.out.print("Enter the number of columns (positive number): ");
            while (!input.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                input.next();
            }
            cols = input.nextInt();
        } while (cols <= 0);

        double[][] array = new double[rows][cols];

        // Get array elements with better formatting
        System.out.println("\nEnter the array elements row by row:");
        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                System.out.printf("  Element [%d,%d]: ", i + 1, j + 1);
                while (!input.hasNextDouble()) {
                    System.out.print("Please enter a valid number: ");
                    input.next();
                }
                array[i][j] = input.nextDouble();
            }
        }

        // Display the array in a grid format
        System.out.println("\nYour array:");
        displayArray(array);

        int[] location = locateLargest(array);
        System.out.println("\nResults:");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.printf("Largest value: %.2f\n", array[location[0]][location[1]]);
        System.out.printf("Location: Row %d, Column %d\n", location[0] + 1, location[1] + 1);
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        input.close();
    }

    // Add new method to display array
    public static void displayArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%6.2f ", array[i][j]);
            }
            System.out.println("]");
        }
    }

    public static int[] locateLargest(double[][] a) {
        int[] result = new int[2];
        double largest = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > largest) {
                    largest = a[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }
}
