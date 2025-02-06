/**
 * Height Class Purpose: Manages and normalizes height measurements in feet and inches. This class is immutable and
 * ensures inches are properly normalized to be less than 12 inches.
 *
 * @author [Nelson Villatoro]
 * @date [01/19/2025]
 */
public class Height {
    // Constant: Number of inches in one foot
    private static final int INCHES_PER_FOOT = 12;

    // Instance variable 1: The number of feet in the height measurement
    private final int feet;

    // Instance variable 2: The number of inches in the height measurement (0-11)
    private final int inches;

    // Constructor: Normalizes inches if value is 12 or greater
    public Height(int feet, int inches) {
        // Normalize inches to be less than 12
        int totalInches = inches;
        int additionalFeet = totalInches / INCHES_PER_FOOT;

        this.feet = feet + additionalFeet;
        this.inches = totalInches % INCHES_PER_FOOT;
    }

    // Converts the height measurement to total inches
    public int toInches() {
        return (feet * INCHES_PER_FOOT) + inches;
    }

    // Returns height as a formatted string (e.g., "5' 11"")
    public String toString() {
        return feet + "' " + inches + "\"";
    }
}