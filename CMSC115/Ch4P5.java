/*
Nelson Villatoro
CMSC115
Chapter 4 Project 5
11/11/2024
Purpose: This program prompts users to enter a Social Security number and validates
whether it follows the correct format (ddd-dd-dddd) where d represents a digit.
*/

public class Ch4P5 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a string for SSN: ");
        String ssn = input.nextLine();

        boolean isValid = ssn.length() == 11 &&
                ssn.charAt(3) == '-' &&
                ssn.charAt(6) == '-' &&
                Character.isDigit(ssn.charAt(0)) &&
                Character.isDigit(ssn.charAt(1)) &&
                Character.isDigit(ssn.charAt(2)) &&
                Character.isDigit(ssn.charAt(4)) &&
                Character.isDigit(ssn.charAt(5)) &&
                Character.isDigit(ssn.charAt(7)) &&
                Character.isDigit(ssn.charAt(8)) &&
                Character.isDigit(ssn.charAt(9)) &&
                Character.isDigit(ssn.charAt(10));

        System.out.println(ssn + " is " + (isValid ? "a valid" : "an invalid") +
                " social security number");

        input.close();
    }
}
