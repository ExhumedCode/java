/*
Nelson Villatoro
CMSC115
Chapter 5 Project 1
11/17/2024

Question

(Count positive and negative numbers and compute the average of numbers)

Write a program that reads an unspecified number of integers, determines how many positive and negative values
have been read, and computes the total and average of the input values (not counting zeros). Your program ends
with the input 0. Display the average as a floating-point number.

Sample Run 1

Enter an integer, the input ends if it is 0: 1 2 -1 3 0
The number of positives is 3
The number of negatives is 1
The total is 5.0
The average is 1.25

Sample Run 2

Enter an integer, the input ends if it is 0: 0
No numbers are entered except 0

Sample Run 3

Enter an integer, the input ends if it is 0: 2 3 4 5 0
The number of positives is 4
The number of negatives is 0
The total is 14
The average is 3.5
*/

public class Ch5P1 {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        // Initialize variables
        int positives = 0;
        int negatives = 0;
        double total = 0;
        int number;

        System.out.print("Enter an integer, the input ends if it is 0: ");

        number = input.nextInt();

        if (number == 0) {
            System.out.println("No numbers are entered except 0");
            return;
        }

        while (number != 0) {
            if (number > 0) {
                positives++;
            } else {
                negatives++;
            }
            total += number;
            number = input.nextInt();
        }

        double average = total / (positives + negatives);

        System.out.println("The number of positives is " + positives);
        System.out.println("The number of negatives is " + negatives);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);

        input.close();
    }
}
