/*
 * This program finds the location of the largest element in a 2D array.
 * It prompts the user to:
 * 1. Enter the dimensions (rows and columns) of the array
 * 2. Input the elements of the array
 * The program then:
 * - Locates the largest element in the array
 * - Returns its value and position (row, column)
 * using a Location class to store these details
 */

import java.util.Scanner;

public class Ch9P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        double[][] array = new double[rows][cols];

        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        Location result = locateLargest(array);
        System.out.println("The largest element is " + result.maxValue +
                ", located at (" + result.row + "," + result.column + ")");
    }

    public static Location locateLargest(double[][] a) {
        Location location = new Location();
        location.maxValue = a[0][0];
        location.row = 0;
        location.column = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > location.maxValue) {
                    location.maxValue = a[i][j];
                    location.row = i;
                    location.column = j;
                }
            }
        }
        return location;
    }
}

class Location {
    public int row;
    public int column;
    public double maxValue;
}