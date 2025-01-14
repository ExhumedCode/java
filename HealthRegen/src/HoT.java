/*
This program shows how a simple post-test loop using a do-while loop would be implemented in a video game setting,
wherein a player's health is restored while under the effect of a healing over time spell until the player's health
reaches a max.
 */

public class HoT {
    public static void main(String[] args) {
        // Initial player stats
        int currentHealth = 60;
        final int MAX_HEALTH = 100;
        int healingPerTick = 5;
        int numberOfTicks = 0;

        System.out.println("Starting healing spell...");
        System.out.println("Initial health: " + currentHealth);

        do {
            currentHealth += healingPerTick;
            numberOfTicks++;

            // Ensure we don't exceed max health
            if (currentHealth > MAX_HEALTH) {
                currentHealth = MAX_HEALTH;
            }

            System.out.println("Tick " + numberOfTicks + " - Current health: " + currentHealth);

        } while (currentHealth < MAX_HEALTH);

        System.out.println("Healing complete! Final health: " + currentHealth);
    }
}
