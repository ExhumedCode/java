import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        System.out.print("Choose the operation (+, -, *, /): ");
        char operator = input.next().charAt(0);
        switch (operator) {
            case '+' -> System.out.println("Result: " + (num1 + num2));
            case '-' -> System.out.println("Result: " + (num1 - num2));
            case '*' -> System.out.println("Result: " + (num1 * num2));
            case '/' -> {
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero");
                }
            }
            default -> System.out.println("Invalid operator");
        }
        input.close();
    }
}