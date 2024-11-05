/*
This program will convert pounds to kilograms
 */

import java.util.Scanner;

public class poundsToKilograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of pounds you want to convert to kilograms: ");
        double pounds = sc.nextDouble();
        double poundsToKilograms = pounds * 0.453592;
        System.out.println(pounds + " pounds is " + poundsToKilograms + " kilograms");
    }
}
