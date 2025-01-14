/*
 * Nelson Villatoro
 * CMSC115
 * Chapter 7 Project 5
 * 12/03/2024
 * 
 * This program determines whether a list of integers is sorted in
 * nondecreasing order. It includes a method isSorted() that returns
 * true if the list is already sorted, and false otherwise.
 * 
 * The program prompts the user to enter the size of the list,
 * followed by the numerical list contents, and then displays whether
 * the list is sorted or not.
 */
public class Ch7P5 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Please enter how many numbers you would like to check (list size): ");
        int size = input.nextInt();

        int[] list = new int[size];

        System.out.println("\nPlease enter " + size + " numbers, one at a time:");
        System.out.println("(Press Enter after each number)");
        for (int i = 0; i < list.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            list[i] = input.nextInt();
        }

        System.out.print("\nYou entered these " + size + " numbers: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]);
            if (i < list.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        if (isSorted(list))
            System.out.println("\nThe numbers are sorted in ascending order.");
        else
            System.out.println("\nThe numbers are not sorted in ascending order.");

        input.close();
    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
