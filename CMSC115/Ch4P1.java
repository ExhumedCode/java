/*
Nelson Villatoro
CMSC115
Chapter 4 Project 1
11/09/2024

This program calculates the area of a regular polygon.
It prompts the user to enter the number of sides and the length of a side,
then computes and displays the area using the formula:
area = (n * s^2) / (4 * tan(π / n))
*/

import java.util.Scanner;

public class Ch4P1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();

        System.out.print("Enter the length of a side: ");
        double s = input.nextDouble();

        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

        System.out.printf("The area of the polygon is %.4f\n", area);
    }
}
