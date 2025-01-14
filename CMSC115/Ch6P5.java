/*
 * This program formats integers by adding leading zeros based on a specified width.
 * It prompts the user to enter a number and desired width, then displays the 
 * formatted result. If the width is less than the number length, it shows the 
 * original number. Otherwise, it pads the number with zeros to match the width.
 */

import java.util.Scanner;

public class Ch6P5 {
    public static String format(int number, int width) {
        String numStr = String.valueOf(number);
        if (width <= numStr.length()) {
            return numStr;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < width - numStr.length(); i++) {
            result.append("0");
        }
        result.append(numStr);
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("Enter the width: ");
        int width = input.nextInt();

        String formatted = format(number, width);
        System.out.println("The formatted number is " + formatted);

        input.close();
    }
}
