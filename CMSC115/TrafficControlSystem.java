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
 * A program that simulates a traffic light system. Use nested if statements to
 * handle pedestrian
 * crossing requests, a multi-way if to manage different light sequences (red,
 * yellow, green),
 * and a switch statement to change light durations based on time of day
 * (morning, afternoon, night).
 */

public class TrafficControlSystem {
    public static void main(String[] args) {
        // Simulated time of day
        String timeOfDay = "morning"; // This could be dynamically set based on a clock

        // Simulated sensor inputs
        boolean pedestrianRequest = true; // Simulated pedestrian button press
        String currentLight = "green"; // Current light color

        // Switch statement to determine light duration based on time of day
        int lightDuration;
        switch (timeOfDay) {
            case "morning":
                lightDuration = 60;
                break;
            case "afternoon":
                lightDuration = 45;
                break;
            case "night":
                lightDuration = 30;
                break;
            default:
                System.out.println("Invalid time of day.");
                return;
        }

        // Multi-way if to manage light sequence
        String lightColor;
        if (currentLight.equals("red")) {
            lightColor = "green";
        } else if (currentLight.equals("yellow")) {
            lightColor = "red";
        } else if (currentLight.equals("green")) {
            lightColor = "yellow";
        } else {
            System.out.println("Invalid light color.");
            return;
        }

        // Nested if to handle pedestrian crossing request
        if (pedestrianRequest) {
            if (currentLight.equals("green")) {
                System.out.println("Pedestrian crossing request detected. Changing light to red.");
                lightColor = "red";
            }
        }

        // Display the result
        System.out.println("The light will change to " + lightColor + " for " + lightDuration + " seconds.");
    }
}