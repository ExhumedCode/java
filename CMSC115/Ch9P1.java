/*
 * This program demonstrates the creation and use of a Rectangle class.
 * It creates two Rectangle objects with different dimensions and displays
 * their properties (width and height) along with calculated area and perimeter.
 * The Rectangle class includes constructors for default and custom dimensions,
 * and methods to calculate area and perimeter of rectangles.
 */

import java.util.Scanner;

public class Ch9P1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter width for rectangle: ");
        double width = input.nextDouble();
        System.out.println("Enter height for rectangle: ");
        double height = input.nextDouble();

        Rectangle rect = new Rectangle(width, height);

        System.out.println("\nRectangle Properties:");
        System.out.println("Width: " + rect.width);
        System.out.println("Height: " + rect.height);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

        input.close();
    }
}

class Rectangle {
    double width;
    double height;

    Rectangle() {
        width = 1;
        height = 2;
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}