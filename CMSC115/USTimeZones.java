/*
 * This program will provide the user with the option to display the current
 * time in a 12-hour format in 3 different US time zones (PST, CST, EST). The
 * program will also allow the user to exit the program when they are done.
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class USTimeZones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the US Time Zones Clock!");
        System.out.println("Please enter the number of the time zone you would like to view: ");
        System.out.println("1. PST");
        System.out.println("2. CST");
        System.out.println("3. Local (EST)");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int userChoice = scanner.nextInt();
        if (userChoice == 1) {
            LocalDateTime pstTime = LocalDateTime.now().minusHours(3);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
            System.out.println("The current time in PST is " + pstTime.format(formatter));
        } else if (userChoice == 2) {
            LocalDateTime cstTime = LocalDateTime.now().minusHours(1);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
            System.out.println("The current time in CST is " + cstTime.format(formatter));
        } else if (userChoice == 3) {
            LocalDateTime estTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
            System.out.println("Your local time (EST) is " + estTime.format(formatter));
        } else if (userChoice == 4) {
            System.out.println("Exiting program...");
        }
        scanner.close();
    }
}
