
/*
Nelson Villatoro
CMSC115
Chapter 5 Project 6
11/19/2024

(Business: check ISBN-13)

ISBN-13 is a new standard for identifying books. It uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. 
The last digit d13 is a checksum, which is calculated from the other digits using the following formula:

10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + d8 + d9 + 3d10 + d11 + 3d12)%10

If the checksum is 10, replace it with 0. Your program should read the input as a string. 
Display "invalid input" if the input is incorrect.

Sample Run 1:
Enter the first 12 digits of an ISBN number as a string: 978013213080
The ISBN-13 number is 9780132130806

Sample Run 2:
Enter the first 12 digits of an ISBN number as a string: 978013213079
The ISBN-13 number is 9780132130790

Sample Run 3:
Enter the first 12 digits of an ISBN number as a string: 97801320
97801320 is an invalid input
*/
import java.util.Scanner;

public class Ch5P6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first 12 digits of an ISBN number as a string: ");
        String isbn = input.nextLine();

        // Check if input is valid (12 digits)
        if (isbn.length() != 12 || !isbn.matches("\\d+")) {
            System.out.println(isbn + " is an invalid input");
            return;
        }

        // Calculate checksum
        int sum = 0;
        for (int i = 0; i < 12; i++) {
            int digit = isbn.charAt(i) - '0'; // Convert char to int
            if (i % 2 == 1) {
                // Multiply by 3 for even-positioned digits (1-based indexing)
                sum += digit * 3;
            } else {
                sum += digit;
            }
        }

        // Calculate the checksum digit
        int checksum = 10 - (sum % 10);
        if (checksum == 10) {
            checksum = 0;
        }

        // Display the complete ISBN-13
        System.out.println("The ISBN-13 number is " + isbn + checksum);

        input.close();
    }
}
