
/**
 * Create a Euphonius Word
 *
 * <p>In this task, you will analyze a given word to ensure it follows specific rules for being
 * "euphonius" (pleasant-sounding).
 *
 * <p>The English alphabet is divided into two categories:
 * - Vowels: a, e, i, o, u, y
 * - Consonants: All other letters (such as b, c, d, etc.)
 *
 * <p>A word is called "euphonius" if it does not contain three or more consecutive vowels
 * or three or more consecutive consonants. If a word has three or more vowels or consonants in a row, it is considered
 * "discordant."
 *
 * <p>Your task is to determine the minimum number of letters you need to insert into the word
 * to make it euphonius. You can add letters anywhere in the word. The output of the program should be a single number:
 * the minimum number of letters required to fix the word.
 *
 * <p>Note: The task is only about determining the number of letters needed to fix the word,
 * not about creating or displaying the fixed word itself.
 *
 * <p>Examples:
 * <p>Sample Input 1: schedule
 * <p>Sample Output 1: 1
 *
 * <p>Sample Input 2: garage
 * <p>Sample Output 2: 0
 *
 * <p>Sample Input 3: player
 * <p>Sample Output 3: 1
 *
 * <p>Sample Input 4: biiiiig
 * <p>Sample Output 4: 2
 */

import java.util.*;

public class Euphonius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userWord = input.nextLine();
        System.out.println(findMinimumLettersNeeded(userWord));
        input.close();
    }

    public static int countVowels(String word) {
        int vowelCount = 0;
        for (String letter : word.split("")) {
            if (letter.equalsIgnoreCase("a") ||
                    letter.equalsIgnoreCase("e") ||
                    letter.equalsIgnoreCase("i") ||
                    letter.equalsIgnoreCase("o") ||
                    letter.equalsIgnoreCase("u") ||
                    letter.equalsIgnoreCase("y")) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static int countConsonants(String word) {
        int consonantCount = 0;
        for (String letter : word.split("")) {
            if (letter.equalsIgnoreCase("b") ||
                    letter.equalsIgnoreCase("c") ||
                    letter.equalsIgnoreCase("d") ||
                    letter.equalsIgnoreCase("f") ||
                    letter.equalsIgnoreCase("g") ||
                    letter.equalsIgnoreCase("h") ||
                    letter.equalsIgnoreCase("j") ||
                    letter.equalsIgnoreCase("k") ||
                    letter.equalsIgnoreCase("l") ||
                    letter.equalsIgnoreCase("m") ||
                    letter.equalsIgnoreCase("n") ||
                    letter.equalsIgnoreCase("p") ||
                    letter.equalsIgnoreCase("q") ||
                    letter.equalsIgnoreCase("r") ||
                    letter.equalsIgnoreCase("s") ||
                    letter.equalsIgnoreCase("t") ||
                    letter.equalsIgnoreCase("v") ||
                    letter.equalsIgnoreCase("w") ||
                    letter.equalsIgnoreCase("x") ||
                    letter.equalsIgnoreCase("z")) {
                consonantCount++;
            }
        }
        return consonantCount;
    }

    public static int findMinimumLettersNeeded(String word) {
        int count = 0;
        for (int i = 0; i < word.length() - 2; i++) {
            String threeLetters = word.substring(i, i + 3);
            if (threeLetters.matches("[aeiouy]{3}") || threeLetters.matches("[bcdfghjklmnpqrstvxzw]{3}")) {
                count++;
                i++; // skip next character since we've handled it
            }
        }
        return count;
    }

    private static boolean isVowel(String letter) {
        return letter.equalsIgnoreCase("a") ||
                letter.equalsIgnoreCase("e") ||
                letter.equalsIgnoreCase("i") ||
                letter.equalsIgnoreCase("o") ||
                letter.equalsIgnoreCase("u") ||
                letter.equalsIgnoreCase("y");
    }
}
