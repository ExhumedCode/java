package DiscussionPosts;

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Paint Calculator!");
        System.out
                .println("This program will calculate the amount of paint needed for your walls based on your needs.");

        // Get wall dimensions from the user (e.g., 12 feet high by 15 feet wide for a
        // typical bedroom wall)
        System.out.print("Enter the height of the wall in feet: ");
        double height = scanner.nextDouble();

        System.out.print("Enter the width of the wall in feet: ");
        double width = scanner.nextDouble();

        // Calculate the total square footage of the wall
        // Example: 12x15 wall = 180 square feet
        double area = height * width;
        System.out.println("Total wall area: " + area + " square feet");

        // Industry standard: 1 gallon covers 350 square feet
        // For example: a 12x15 wall (180 sq ft) would need 0.51 gallons
        double coveragePerGallon = 350.0;
        // Math.ceil() rounds up because buying multiple quarts would be impractical
        // Example: 180/350 = 0.51 gallons -> rounds up to 1 gallon
        double gallonsNeeded = Math.ceil(area / coveragePerGallon);

        System.out.println("You will need approximately " + (int) gallonsNeeded + " gallon(s) of paint.");

        scanner.close();
    }
}