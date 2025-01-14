/* 
 This program will prompt the user to enter a number repeatedly until a number that is divisible by 3 has been entered
 */

import java.util.Scanner;

public class WhileNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();
        } while (number % 3 != 0);
    }

}
