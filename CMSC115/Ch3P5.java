
/**
 * This program prompts the user to enter a point (x, y) and checks whether
 * the point is within the rectangle centered at (0, 0) with width 10 and height 5.
 * A point is in the rectangle if its horizontal distance to (0, 0) is less than
 * or equal to 10 / 2 and its vertical distance to (0, 0) is less than or equal to 5 / 2.
 * 
 * Sample Runs:
 * Enter a point with two coordinates: 2.0 2.0
 * Point (2.0, 2.0) is in the rectangle
 * 
 * Enter a point with two coordinates: 6 4
 * Point (6.0, 4.0) is not in the rectangle
 * 
 * Enter a point with two coordinates: -5.1 -2.4
 * Point (-5.1, -2.4) is not in the rectangle
 * 
 * Enter a point with two coordinates: -4.9 2.49
 * Point (-4.9, 2.49) is in the rectangle
 * 
 * Enter a point with two coordinates: -4.99 -2.499
 * Point (-4.99, -2.499) is in the rectangle
 */

import java.util.Scanner;

public class Ch3P5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a point with two coordinates
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Check if the point is within the rectangle
        boolean isInRectangle = (Math.abs(x) <= 10.0 / 2) && (Math.abs(y) <= 5.0 / 2);

        // Display the result
        if (isInRectangle) {
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        }

        input.close();
    }
}
