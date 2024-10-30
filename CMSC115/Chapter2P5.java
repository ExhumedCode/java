/*
(Financial application: future investment value)

Write a program that reads in investment amount, annual interest rate, and number of years,
and displays the future investment value using the following formula:

For example, if you enter amount 1000.56, annual interest rate 4.25%, and number of years 1,
the future investment value is $1043.92.

Sample Run

Enter investment amount: 1000.56
Enter annual interest rate in percentage: 4.25
Enter number of years: 1
Accumulated value is $1043.92


 */

import java.util.Scanner;

public class Chapter2P5 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter investment amount: ");
    double investmentAmount = input.nextDouble();
    System.out.println("Enter annual interest rate in percentage: ");
    double AnnualInterestRate = input.nextDouble();
    double monthlyInterestRate = AnnualInterestRate / 1200;
    System.out.println("Enter number of years: ");
    double numberOfYears = input.nextDouble();
    double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, 12 * numberOfYears);
    System.out.printf("Accumulated value is $%.2f", futureInvestmentValue);
    }

}
