
/*
 * Program: Sum with Break Conditions
 * 
 * This program reads a sequence of integers and calculates their sum with specific conditions:
 * 1. If the input number is 0, stop and output the current sum
 * 2. If the sum reaches or exceeds 1000, stop and output (sum - 1000)
 * 
 * Sample Input:    Sample Output:
 * 800             3
 * 101
 * 102
 * 300
 * 0
 * 
 * Note: Any additional numbers after meeting either condition are ignored.
 */
import java.util.Scanner;

public class SumBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int num = sc.nextInt();
            sum += num;
            if (num == 0) {
                break;
            } else if (sum >= 1000) {
                sum -= 1000;
                break;
            }
        }
        System.out.println(sum);
    }
}
