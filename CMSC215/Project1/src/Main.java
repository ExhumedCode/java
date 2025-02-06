import java.util.Scanner;

/**
 * Basketball Player Data Analysis Program Main class with the main method that
 * initializes and starts the player data
 * analysis program.
 * <p>
 * This program uses the following supporting classes:
 * - Height: Manages and normalizes height measurements in feet and inches
 * - Player: Stores individual player data (name, height, age)
 * - Player1: Handles player data collection and analysis
 *
 * @author [Nelson Villatoro]
 * @date [01/19/2025]
 */
public class Main {
    /**
     * Entry point for the basketball player analysis program. Creates necessary
     * objects and initiates the player data
     * collection process.
     */
    public static void main(String[] args) {
        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Create processor object to handle player data
        Project1 playerProcessor = new Project1();

        // Process all player input and display results
        playerProcessor.processPlayerInput(scanner);

        // Clean up resources by closing scanner.
        scanner.close();
    }
}
