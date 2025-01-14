
/*  This program will read a sequence of numbers, the first of which is the number of numbers to read.
    It will then read the numbers as they are entered and print the sum of numbers that are divisible by 6.
*/
import java.util.Scanner;

public class forSumSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfElements = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < numOfElements; i++) {
            int number = scanner.nextInt();
            if (number % 6 == 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
