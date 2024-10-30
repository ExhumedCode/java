
/**
 * Contact Time Zone Checker is a utility program that simulates a smart
 * contacts
 * application which considers time zones before placing calls. The program
 * helps
 * users make informed decisions about calling contacts in different time zones
 * by checking if it might be too late at the contact's location.
 * 
 * The program manages three contacts in different time zones:
 * - Contact 1: Pacific Standard Time (PST, user's time zone)
 * - Contact 2: Central Standard Time (CST, +2 hours from PST)
 * - Contact 3: Eastern Standard Time (EST, +3 hours from PST)
 * 
 * If a user attempts to call when it's past 9:00 PM in the contact's time zone,
 * the program will warn the user and ask for confirmation before proceeding
 * with
 * the call.
 * 
 * @author Nelson Villatoro
 * @version 1.0
 * @date October 29, 2024
 * @course CMSC115
 */

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SmartContacts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Contact information
        String[] contacts = { "John", "Sarah", "Mike" };
        String[] timeZones = { "PST", "CST", "EST" };

        System.out.println("Welcome to Smart Contacts App!");

        int choice;
        do {
            // Display menu
            System.out.println("\nChoose a contact to call:");
            System.out.println("1. " + contacts[0] + " (" + timeZones[0] + ")");
            System.out.println("2. " + contacts[1] + " (" + timeZones[1] + ")");
            System.out.println("3. " + contacts[2] + " (" + timeZones[2] + ")");
            System.out.println("4. Exit");

            // Get user choice
            System.out.print("\nEnter your choice (1-4): ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 3) {
                // Get current time and adjust for time zone
                LocalTime currentTime = LocalTime.now();
                LocalTime contactTime = currentTime;

                // Adjust time based on contact's time zone
                if (choice == 2) { // CST
                    contactTime = currentTime.plusHours(2);
                } else if (choice == 3) { // EST
                    contactTime = currentTime.plusHours(3);
                }

                // Check if it's too late to call
                if (contactTime.isAfter(LocalTime.of(21, 0))) { // 9:00 PM
                    System.out.println("\nIt might be too late to call " + contacts[choice - 1] +
                            ". Local time at contact's location: " +
                            contactTime.format(DateTimeFormatter.ofPattern("HH:mm")));
                    System.out.print("Would you like to call anyway? (Y/N): ");

                    scanner.nextLine(); // Clear buffer
                    String response = scanner.nextLine().toUpperCase();

                    if (response.equals("Y")) {
                        System.out.println("Calling " + contacts[choice - 1] + "...");
                    } else {
                        System.out.println("Call cancelled.");
                    }
                } else {
                    System.out.println("Calling " + contacts[choice - 1] + "...");
                }
            } else if (choice == 4) {
                System.out.println("\nThank you for using Smart Contacts App. Goodbye!");
            } else {
                System.out.println("\nInvalid option. Please select 1-4");
            }

        } while (choice != 4);

        scanner.close();
    }
}
