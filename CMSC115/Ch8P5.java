/*
 * Nelson Villatoro
 * CMSC115
 * Chapter 8 Project 5
 * 12/03/2024
 * 
 * This program finds the central city among a set of cities. The central city
 * is defined as the city that has the shortest total distance to all other cities,
 * where distance is calculated using the Euclidean formula: √((x₁-x₂)² + (y₁-y₂)²).
 * 
 * The program prompts the user to enter the number of cities and their x,y coordinates,
 * then calculates and displays the central city location and the total distance
 * from it to all other cities.
 */
public class Ch8P5 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("           Central City Calculator            ");
        System.out.println("===============================================");
        System.out.println("This program finds the central city among a set of cities.");
        System.out.println("The central city has the shortest total distance to all other cities.\n");

        int numCities = 0;
        do {
            System.out.print("Enter the number of cities (must be at least 2): ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                input.next(); // Clear invalid input
            }
            numCities = input.nextInt();
            if (numCities < 2) {
                System.out.println("Error: You must enter at least 2 cities.");
            }
        } while (numCities < 2);

        double[][] cities = new double[numCities][2];

        System.out.println("\nFor each city, you will need to enter two numbers:");
        System.out.println("1. The x-coordinate (horizontal position)");
        System.out.println("2. The y-coordinate (vertical position)");
        System.out.println("\nExample:");
        System.out.println("For a city at position x=3.5, y=-2.0");
        System.out.println("When prompted, enter: 3.5 [Enter] -2.0 [Enter]");

        for (int i = 0; i < numCities; i++) {
            System.out.printf("\nCity #%d:\n", (i + 1));

            // Get X coordinate
            while (true) {
                System.out.print("Enter the x-coordinate: ");
                if (input.hasNextDouble()) {
                    cities[i][0] = input.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number.");
                    input.next(); // Clear invalid input
                }
            }

            // Get Y coordinate
            while (true) {
                System.out.print("Enter the y-coordinate: ");
                if (input.hasNextDouble()) {
                    cities[i][1] = input.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number.");
                    input.next(); // Clear invalid input
                }
            }
        }

        int centralCity = findCentralCity(cities);
        double totalDistance = calculateTotalDistance(cities, centralCity);

        System.out.println("\nResults:");
        System.out.printf("The central city (city #%d) is at (%.1f, %.1f)\n",
                centralCity + 1, cities[centralCity][0], cities[centralCity][1]);
        System.out.printf("The total distance to all other cities is %.2f units\n", totalDistance);

        input.close();
    }

    public static int findCentralCity(double[][] cities) {
        int centralCity = 0;
        double shortestDistance = Double.MAX_VALUE;

        for (int i = 0; i < cities.length; i++) {
            double totalDistance = calculateTotalDistance(cities, i);
            if (totalDistance < shortestDistance) {
                shortestDistance = totalDistance;
                centralCity = i;
            }
        }

        return centralCity;
    }

    public static double calculateTotalDistance(double[][] cities, int fromCity) {
        double totalDistance = 0;

        for (int i = 0; i < cities.length; i++) {
            if (i != fromCity) {
                totalDistance += calculateDistance(
                        cities[fromCity][0], cities[fromCity][1],
                        cities[i][0], cities[i][1]);
            }
        }

        return totalDistance;
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
