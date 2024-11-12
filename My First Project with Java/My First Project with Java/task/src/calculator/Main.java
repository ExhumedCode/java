package calculator;

import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bubblegum = 202;
        int toffee = 118;
        int iceCream = 2250;
        int milkChocolate = 1680;
        int doughnut = 1075;
        int pancake = 80;
        int income = bubblegum + toffee + iceCream + milkChocolate + doughnut + pancake;
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: " + bubblegum);
        System.out.println("Toffee: " + toffee);
        System.out.println("Ice cream: " + iceCream);
        System.out.println("Milk chocolate: " + milkChocolate);
        System.out.println("Doughnut: " + doughnut);
        System.out.println("Pancake: " + pancake);
        System.out.println("Income: " + income);
        System.out.println("Staff expenses:");
        int staffExpenses = input.nextInt();
        System.out.println("Other expenses:");
        int otherExpenses = input.nextInt();
        System.out.println("Net income: $" + (income - staffExpenses - otherExpenses));
    }
}