/*
 * Demonstrates pass-by-value in Java using a video game power-up example. Note
 * that the original value is not affected by the changes made to the COPY of
 * the value.
 */
public class PassByValue {
    public static void applyAttackPotion(int playerAttack) {
        System.out.println("[*] Drinking Attack Potion...");
        playerAttack *= 2; // playerAttack is now 200, but this only affects the copy
        System.out.println("[!] Attack Power boosted to " + playerAttack);
    }

    public static void main(String[] args) {
        int playerAttack = 100; // Original value of playerAttack
        System.out.println("[>] Initial Attack Power: " + playerAttack);

        applyAttackPotion(playerAttack); // Method is called and a COPY of the original value is passed
        System.out.println("[~] Potion effect has worn off...");
        System.out.println("[>] Current Attack Power: " + playerAttack); // Original value is unchanged
    }
}
