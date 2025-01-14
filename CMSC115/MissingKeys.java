/*
 * This program simulates a key management system that tracks the status of various
 * keys (house, car, and office). It allows users to check if specific keys are
 * stored securely or missing through a simple menu-driven interface. The program
 * demonstrates object creation, data fields (keyID, location, isStored), and
 * methods to check key status.
 */

import java.util.Scanner;

// Example class capable of instantiating key objects
public class MissingKeys {
    // Data fields for tracking key information
    private String keyID;
    private String location;
    private boolean isStored;

    // Constructor for creating key objects with initial values
    public MissingKeys(String keyID, String location, boolean isInitiallyStored) {
        this.keyID = keyID;
        this.location = location;
        this.isStored = isInitiallyStored;
    }

    // Method to display the current status of a key
    public void checkStatus() {
        String keyType;
        switch (keyID) {
            case "HOUSE-001":
                keyType = "House Key";
                break;
            case "CAR-001":
                keyType = "Car Key";
                break;
            case "OFFICE-001":
                keyType = "Office Key";
                break;
            default:
                keyType = "Unknown Key";
        }

        if (isStored) {
            System.out.println(keyType + " (" + keyID + ") is currently stored and secure.");
        } else {
            System.out.println(keyType + " (" + keyID + ") is currently missing!");
            System.out.println("Last known location: " + location);
        }
    }

    // Method to update key status when returned to storage
    public void returnKey() {
        this.location = "Key Storage Box";
        this.isStored = true;
        System.out.println("Key successfully returned to key storage box.");
    }

    public static void main(String[] args) {
        // Object instantiation with different initial states
        MissingKeys key1 = new MissingKeys("HOUSE-001", "Key Storage Box", true);
        MissingKeys key2 = new MissingKeys("CAR-001", "Key Storage Box", true);
        MissingKeys key3 = new MissingKeys("OFFICE-001", "Living Room", false);

        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        // Display welcome message and usage instructions
        System.out.println("\n=== Welcome to the Key Status Checker ===");
        System.out.println("This program helps you track the status of your keys.");
        System.out.println("You can check if your keys are stored or missing.");
        System.out.println("\nHow to use:");
        System.out.println("1. Select a key number from the menu");
        System.out.println("2. View the status of your selected key");
        System.out.println("3. For the missing Office Key, you will be prompted to locate and return it.");
        System.out.println("4. Select option 4 when you're done");
        System.out.println("\nPress Enter to begin...");
        scanner.nextLine();

        // Main program loop for user interaction
        while (continueProgram) {
            // Display menu options
            System.out.println("\nKey Status Checker");
            System.out.println("------------------");
            System.out.println("1: House Key");
            System.out.println("2: Car Key");
            System.out.println("3: Office Key");
            System.out.println("4: Exit Program");
            System.out.print("\nEnter your choice (1-4): ");

            String input = scanner.nextLine();

            // Process user selection
            switch (input) {
                case "1":
                    key1.checkStatus();
                    break;
                case "2":
                    key2.checkStatus();
                    break;
                case "3":
                    key3.checkStatus();
                    // Additional interaction for missing office key
                    if (!key3.isStored) {
                        System.out.print("Would you like to ping your office key? (yes/no): ");
                        String pingResponse = scanner.nextLine().trim().toLowerCase();
                        if (pingResponse.equals("yes")) {
                            System.out.print("Have you located the office key? (yes/no): ");
                            String locatedResponse = scanner.nextLine().trim().toLowerCase();
                            if (locatedResponse.equals("yes")) {
                                System.out.print(
                                        "Please return the key to the key storage box. Has the key been returned? (yes/no): ");
                                String returnedResponse = scanner.nextLine().trim().toLowerCase();
                                if (returnedResponse.equals("yes")) {
                                    key3.returnKey();
                                } else {
                                    System.out.println("Key not returned. Please try again later.");
                                }
                            } else {
                                System.out.println("Key not located. Please try again later.");
                            }
                        }
                    }
                    break;
                case "4":
                    System.out.println("Thank you for using Key Status Checker. Goodbye!");
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Invalid input. Please enter a number between 1 and 4.");
            }

            // Pause before next iteration
            if (continueProgram) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
