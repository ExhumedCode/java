/* (Financial application:calculate tips)

Write a program that reads the subtotal and the gratuity rate,then computes the gratuity and total.For example,
if the user enters 10 for subtotal and 15%for gratuity rate,the program displays $1.5as gratuity and $11.5as total.

  Sample Run

        Enter the subtotal and a gratuity rate:10 15
        The gratuity is $1.5and total is $11.5
*/

import java.util.Scanner;

public class Chapter2P1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }

}
