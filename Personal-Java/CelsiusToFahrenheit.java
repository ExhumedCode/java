public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println("Welcome... let's see what 67 degrees celsius is equal to in Fahrenheit");
        System.out.println("67 degrees celsius is equal to the following Fahrenheit temperature:");
        // Writing System.out.println(((9 / 5) * 67) + 32) would cause a logical error and return the wrong
        // temperature because it would do integer division and truncate the decimal portion for 9/5
        System.out.println(((9.0 / 5.0) * 67) + 32);
    }
}
