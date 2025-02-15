

import java.util.Scanner;
import java.util.Random;

public class RandomWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        String champion = "";
        Random randomChance = new Random();
        while (input.hasNext()) {
            String word = input.next();
            System.out.println(word);
            double chance = randomChance.nextDouble();
            champion = (chance < (1.0 / (count + 1))) ? word : champion;
            count++;
        }
        System.out.println(champion);
    }
}