/*
 * Demonstrates how passing an object reference by value allows a method to modify
 * the object's internal state, with changes persisting outside the method.
 */
public class PassByReference {
    // Class representing a player in the game
    static class Player {
        private int level;
        private String status;

        // Constructor to create a new player with level 1 and 'Novice' status
        public Player() {
            this.level = 1;
            this.status = "Novice";
        }

        // Getter methods to access the player's level and status
        public int getLevel() {
            return level;
        }

        public String getStatus() {
            return status;
        }

        // Method to increase the player's level
        public void levelUp(int levels) {
            this.level += levels;
        }
    }

    // Method that attempts to modify the player's status
    public static void upgradeStatus(Player player) {
        System.out.println("[*] Upgrading status...");
        if (player.getLevel() >= 10) {
            player.status = "Elite"; // Modifies the player's status
            System.out.println("[!] Status upgraded to " + player.getStatus());
        } else {
            System.out.println("[!] Not enough levels to upgrade status.");
        }
    }

    public static void main(String[] args) {
        Player player = new Player(); // Original player object
        System.out.println("[>] Initial Level: " + player.getLevel());
        System.out.println("[>] Initial Status: " + player.getStatus());

        player.levelUp(9); // Increase player's level to 10
        System.out.println("\n[>] Level after leveling up: " + player.getLevel());

        upgradeStatus(player); // Passes a copy of the reference to the method

        System.out.println("[>] Current Status: " + player.getStatus()); // Status is changed
    }
}
