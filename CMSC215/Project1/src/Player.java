/**
 * Player Class Stores and manages individual basketball player information including name, height, and age. This
 * immutable class uses the Height class for height measurements.
 *
 * @author Nelson Villatoro
 * @date 01/19/2025
 */
public class Player {
    // Player's personal information
    private final String name;
    private final Height height;
    private final int age;

    // Constructor to initialize player data
    public Player(String name, Height height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    // Getter method for the player's name
    public String getName() {
        return name;
    }

    // Getter method for the player's height
    public Height getHeight() {
        return height;
    }

    // Getter method for the player's age
    public int getAge() {
        return age;
    }

    // Returns formatted string with player's information
    public String toString() {
        return "Name: " + name + " Age: " + age + " Height: " + height.toString();
    }
}
