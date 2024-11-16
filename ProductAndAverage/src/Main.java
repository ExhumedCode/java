import java.util.Scanner;

public class Main {
    static int product(int num1, int num2) {
        return num1 * num2;
    }

    static int average(int num1, int num2) {
        int roundedAverage = (int) Math.floor((num1 + num2) /2.0);
        return roundedAverage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Store and print the results
        int productResult = product(num1, num2);
        int averageResult = average(num1, num2);

        System.out.println(productResult);
        System.out.println(averageResult);
    }
}