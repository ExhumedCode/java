
/**
 * Nelson Villatoro
 * CMSC115 Week 3 Discussion Program
 * 11/04/2024
 *
 * This program will show the difference between a nested if, multi-way if, and
 * switch statement by providing a simple program that uses all three of these
 * types of statements.
 *
 * Example program:
 * A simple text-based adventure game where a player fights a dragon boss. Uses nested if statements to
 * handle player attack choices (physical or magical), a multi-way if to manage different dragon states
 * (enraged, normal, weakened), and a switch statement to determine damage multipliers based on weapon
 * type (sword, bow, staff). The game demonstrates control flow with different combat scenarios and
 * outcomes based on player decisions and dragon status.
 */

import java.util.Scanner;

public class SimpleTextGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int healthPoints = 100;
        boolean ImmuneToFire = true;
        boolean ResistantToIce = true;
        boolean WeakToLightning = true;

        System.out.println(
                "You suddenly find yourself staring right into the gaping maw of the Dread Dragon of Elworn...\n");
        System.out.println("You have seconds to decide what to do...\nWhat will you do?\n");

        System.out.println("[1] Fight\n");
        System.out.println("[2] Flee\n");

        int choice = 0;
        // Nested if statement within while loop to handle invalid input
        while (true) {
            System.out.print("Enter your choice (Enter 1 or 2): ");
            if (input.hasNextInt()) {
                choice = input.nextInt();
                if (choice == 1 || choice == 2) {
                    break;
                } else {
                    System.out.println("Invalid choice! Please enter 1 or 2.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                input.next();
            }
        }

        if (choice == 1) {
            System.out.println(
                    "With a rush of adrenaline, you charge at the dragon with your sword and slash at its legs, causing it to stagger back, creating some distance between you and the dragon.\n");
            System.out.println(
                    "This is your chance! Recall that you are a gifted magic user, capable of devastating elemental magic.\n");
            System.out.println("Choose from the following spells:\n");

            System.out.println("[1] Fire Blast\n");
            System.out.println("[2] Lightning Strike\n");
            System.out.println("[3] Blizzard\n");

            int spellChoice = 0;
            while (true) {
                System.out.print("Enter your spell choice: ");
                if (input.hasNextInt()) {
                    spellChoice = input.nextInt();
                    if (spellChoice >= 1 && spellChoice <= 3) {
                        break;
                    } else {
                        System.out.println("Invalid spell choice! Please enter a number between 1 and 3.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a number.");
                    input.next();
                }
            }

            boolean proceed = true;

            switch (spellChoice) {
                case 1:
                    System.out.println(
                            "As you prepare to unleash a fiery barrage at your foe... you feel that you cannot gather the necessary fire essence as easily as you normally would...\n");
                    System.out.print("Do you wish to proceed with Fire Blast? (yes/no): ");
                    String fireDecision = input.next();
                    if (!fireDecision.toLowerCase().equals("yes")) {
                        proceed = false;
                    }
                    if (proceed) {
                        if (ImmuneToFire) {
                            System.out.println("The dragon absorbs your fire magic and becomes ENRAGED!\n");
                            System.out.println("The enraged dragon unleashes its ultimate attack: INFERNO!\n");
                            System.out.println("You are completely incinerated by the overwhelming flames...\n");
                            System.out.println("GAME OVER - Don't use fire against a dragon!\n");
                        } else {
                            System.out.println("The fire magic hits the dragon!\n");
                            healthPoints -= 20;
                            if (healthPoints <= 0) {
                                System.out.println("VICTORY - You have slain the Dread Dragon of Elworn!\n");
                            } else {
                                System.out.println("The dragon is still standing!\n");
                            }
                        }
                    } else {
                        System.out.println("You decide not to use Fire Blast.\n");
                    }
                    break;
                case 2:
                    System.out.println(
                            "As you prepare to call down a bolt of lightning... you sense the dragon's vulnerability to this element...\n");
                    System.out.print("Do you wish to proceed with Lightning Strike? (yes/no): ");
                    String lightningDecision = input.next();
                    if (!lightningDecision.toLowerCase().equals("yes")) {
                        proceed = false;
                    }
                    if (proceed) {
                        if (WeakToLightning) {
                            System.out.println("The lightning bolt pierces straight through the dragon's scales!\n");
                            healthPoints = 0;
                            System.out
                                    .println("With an earth-shaking roar, the mighty dragon crashes to the ground.\n");
                            System.out.println("VICTORY - You have slain the Dread Dragon of Elworn!\n");
                        } else {
                            System.out.println("The lightning magic hits the dragon!\n");
                            healthPoints -= 15;
                            if (healthPoints <= 0) {
                                System.out.println("VICTORY - You have slain the Dread Dragon of Elworn!\n");
                            } else {
                                System.out.println("The dragon is still standing!\n");
                            }
                        }
                    } else {
                        System.out.println("You decide not to use Lightning Strike.\n");
                    }
                    break;
                case 3:
                    System.out.println(
                            "As you prepare to unleash a chilling blizzard... you feel the dragon's resistance to ice...\n");
                    System.out.print("Do you wish to proceed with Blizzard? (yes/no): ");
                    String blizzardDecision = input.next();
                    if (!blizzardDecision.toLowerCase().equals("yes")) {
                        proceed = false;
                    }
                    if (proceed) {
                        if (ResistantToIce) {
                            System.out.println("The icy magic seems to only mildly irritate the dragon...\n");
                            System.out.println("The dragon retaliates with a blast of flame!\n");
                            System.out.println("GAME OVER - Your ice magic wasn't strong enough!\n");
                        } else {
                            System.out.println("The dragon is frozen solid and shatters into pieces!\n");
                            System.out.println("VICTORY - You have slain the Dread Dragon of Elworn!\n");
                        }
                    } else {
                        System.out.println("You decide not to use Blizzard.\n");
                    }
                    break;
                default:
                    System.out.println("You fumble the spell casting!\n");
                    System.out.println("The dragon takes advantage of your confusion...\n");
                    System.out.println("GAME OVER - Always choose a valid spell!\n");
            }

        } else if (choice == 2) {
            System.out.println(
                    "You turn and run as fast as you can, but the dragon breathes fire on you, burning you to a crisp.\n");
            System.out.println("GAME OVER - You cannot escape the dragon's wrath!\n");
        }
    }
}
