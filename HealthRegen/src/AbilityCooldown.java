// This program shows a simple pre-test loop to demonstrate the cooldown of an Ultimate Ability in a video game.

public class AbilityCooldown {
    public static void main(String[] args) {
        // Maximum cooldown time in seconds
        int coolDown = 1000;

        // Tracks the current progress of the cooldown timer
        // Starts at 0, as if the ability was just used
        int currentCooldown = 0;

        // Pre-test loop checks if ability is available for use
        while (currentCooldown < coolDown) {
            // Increment the cooldown timer
            currentCooldown++;

            // Display remaining time until ability is ready
            System.out.println("Time left until Ultimate is ready: " + (coolDown - currentCooldown) + " seconds");
        }
        // When loop ends, currentCooldown equals coolDown and ability is ready to use
    }
}
