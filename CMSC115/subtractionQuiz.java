// This program simulates a simple subtraction quiz

import java.util.Scanner;

public class subtractionQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, Evelyn! This is will help you practice subtraction.");
        System.out.println("I'll give you two numbers to do some subtraction with.");
        System.out.println("Ready?");
        System.out.println("Here we go!");

        while (true) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            if (number1 < number2) {
                number1 = number2;
            }

            System.out.println("What is " + number1 + " - " + number2 + "?");
            int answer = sc.nextInt();
            if (number1 - number2 == answer) {
                System.out.println("You got it right!");
            } else {
                System.out.println("You got it wrong. The correct answer is " + (number1 - number2));
            }

            System.out.println("\nLet's try another one!\n");
        }
    }
}