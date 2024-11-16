package DiscussionPosts;

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Paint Calculator!");
        System.out
                .println("This program will calculate the amount of paint needed for your walls based on your needs.");

        // Get wall dimensions from the user
        System.out.print("Enter the height of the wall in feet: ");
        double height = scanner.nextDouble();

        System.out.print("Enter the width of the wall in feet: ");
        double width = scanner.nextDouble();

        // Calculate the area of the wall
        double area = height * width;
        System.out.println("Total wall area: " + area + " square feet");

        // Assuming 1 gallon of paint covers 350 square feet, run the calculation
        double coveragePerGallon = 350.0;
        double gallonsNeeded = Math.ceil(area / coveragePerGallon);

        System.out.println("You will need approximately " + (int) gallonsNeeded + " gallon(s) of paint.");

        scanner.close();
    }
}