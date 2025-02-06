import java.util.Scanner;
import java.util.ArrayList;

/**
 * Project1 Class This class manages basketball player statistics, collecting
 * data like names, ages, and heights. It
 * specifically helps identify the tallest player who is at or below the the
 * average age of all players.
 *
 * @author Nelson Villatoro
 * @date 01/19/2025
 */
public class Project1 {
    // List to store all player objects
    private ArrayList<Player> players;

    // Constructor initializes empty player list
    public Project1() {
        players = new ArrayList<>();
    }

    /**
     * Processes user input for player data until empty line is entered. Calls
     * displayResults() after collecting all
     * player data.
     *
     * @param scanner Scanner object for reading user input
     */
    public void processPlayerInput(Scanner scanner) {
        double totalAge = 0;

        while (true) {
            System.out.print("Enter player's name, age, and height in feet and inches: ");
            String input = scanner.nextLine().trim();

            // Check for empty input to break the loop
            if (input.isEmpty()) {
                break;
            }

            // Parses user input into individual player data components
            String[] data = input.split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            Height height = new Height(Integer.parseInt(data[2]), Integer.parseInt(data[3]));

            // Create and store new player
            Player player = new Player(name, height, age);
            players.add(player);
            totalAge += age;
        }

        displayResults(totalAge);
    }

    // Displays average age and tallest player under the average age
    // Depends on: findTallestUnderAverageAge()
    // Called by: processPlayerInput()
    private void displayResults(double totalAge) {
        if (players.isEmpty()) {
            System.out.println("No player data entered.");
            return;
        }

        // Logic to calculate and display average age
        double averageAge = totalAge / players.size();
        System.out.printf("The average age of all players is %.2f%n", averageAge);

        // Logic to find and display tallest player under average age
        Player tallestUnderAverageAge = findTallestUnderAverageAge(averageAge);
        if (tallestUnderAverageAge != null) {
            System.out.println("Tallest player whose age is less than the average is:");
            System.out.println("    " + tallestUnderAverageAge.toString());
        }
    }

    // Finds the tallest player whose age is less than or equal to average
    // Called by: displayResults()
    private Player findTallestUnderAverageAge(double averageAge) {
        Player tallest = null;
        int maxHeightInInches = -1;

        for (Player player : players) {
            int currentHeight = player.getHeight().toInches();
            if (player.getAge() <= averageAge && currentHeight > maxHeightInInches) {
                maxHeightInInches = currentHeight;
                tallest = player;
            }
        }
        return tallest;
    }
}
