/*
 * Write a program that prompts the user to enter the month and year and displays the number of days in the month.
 * For example, if the user entered month 2 and year 2012, the program should display:
 * February 2012 has 29 days
 * If the user entered month 3 and year 2015, the program should display:
 * March 2015 has 31 days
 * 
 * Sample Run 1:
 * Enter a month in the year (e.g., 1 for Jan): 2
 * Enter a year: 2012
 * February 2012 has 29 days
 * 
 * Sample Run 2:
 * Enter a month in the year (e.g., 1 for Jan): 4
 * Enter a year: 2005
 * April 2005 has 30 days
 * 
 * Sample Run 3:
 * Enter a month in the year (e.g., 1 for Jan): 2
 * Enter a year: 2006
 * February 2006 has 28 days
 * 
 * Sample Run 4:
 * Enter a month in the year (e.g., 1 for Jan): 2
 * Enter a year: 2000
 * February 2000 has 29 days
 */

import java.util.Scanner;

public class Ch3P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month in the year (e.g., 1 for Jan): ");
        int month = input.nextInt();
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        int days = 0;
        String monthName = "";

        switch (month) {
            case 1:
                monthName = "January";
                days = 31;
                break;
            case 2:
                monthName = "February";
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29; // Leap year
                } else {
                    days = 28;
                }
                break;
            case 3:
                monthName = "March";
                days = 31;
                break;
            case 4:
                monthName = "April";
                days = 30;
                break;
            case 5:
                monthName = "May";
                days = 31;
                break;
            case 6:
                monthName = "June";
                days = 30;
                break;
            case 7:
                monthName = "July";
                days = 31;
                break;
            case 8:
                monthName = "August";
                days = 31;
                break;
            case 9:
                monthName = "September";
                days = 30;
                break;
            case 10:
                monthName = "October";
                days = 31;
                break;
            case 11:
                monthName = "November";
                days = 30;
                break;
            case 12:
                monthName = "December";
                days = 31;
                break;
            default:
                System.out.println("Invalid month");
                System.exit(1);
        }

        System.out.println(monthName + " " + year + " has " + days + " days");
        input.close();
    }
}
