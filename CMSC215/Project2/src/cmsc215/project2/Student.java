package cmsc215.project2;

/**
 * Scope: Represents a student with their academic information including name,
 * credits, and quality points.
 * Functionality: Compute GPA and determine honor society eligibility.
 *
 * Author: Nelson Villatoro
 * Date: Feb 5 2025
 */
public class Student {

    /**
     * Maximum allowable GPA.
     */
    private static final double MAX_GPA = 4.0;

    /**
     * Student's name.
     */
    private String name;

    /**
     * Number of credit hours earned.
     */
    private int creditHours;

    /**
     * Total quality points earned.
     */
    private double qualityPoints;

    /**
     * The minimum GPA threshold for honor society eligibility.
     */
    private static double gpaThreshold;

    /**
     * Constructs a Student with the given academic information.
     *
     * @param name          the student's name
     * @param creditHours   the total number of credit hours earned
     * @param qualityPoints the total quality points earned
     * @throws IllegalArgumentException if name is null/empty, or if
     *                                  creditHours/qualityPoints are negative
     */
    public Student(String name, int creditHours, double qualityPoints) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be empty.");
        }
        if (creditHours < 0) {
            throw new IllegalArgumentException("Credit hours cannot be negative");
        }
        if (qualityPoints < 0) {
            throw new IllegalArgumentException("Quality points cannot be negative");
        }

        this.name = name.trim();
        this.creditHours = creditHours;
        this.qualityPoints = qualityPoints;
    }

    /**
     * @return the student's GPA (qualityPoints / creditHours)
     * @throws ArithmeticException if creditHours is 0
     */
    public double gpa() {
        if (creditHours == 0) {
            throw new ArithmeticException("Cannot calculate GPA with 0 credit hours.");
        }
        return qualityPoints / creditHours;
    }

    /**
     * @return true if the student's GPA meets or exceeds the honor society
     *         threshold
     */
    public boolean eligibleForHonorSociety() {
        try {
            return gpa() >= gpaThreshold;
        } catch (ArithmeticException e) {
            return false;
        }
    }

    /**
     * @return string representation in format: "Name (GPA: x.xx) where x.xx is
     *         the student's GPA.
     */
    @Override
    public String toString() {
        String gpaStr;
        try {
            gpaStr = String.format("%.2f", gpa());
        } catch (ArithmeticException e) {
            gpaStr = "N/A";
        }
        return "Name: " + name + " GPA " + gpaStr;
    }

    /**
     * Sets the GPA threshold for honor society membership.
     *
     * @throws IllegalArgumentException if threshold is not between 0.0 and 4.0
     */
    public static void setGpaThreshold(double threshold) {
        if (threshold < 0.0 || threshold > MAX_GPA) {
            throw new IllegalArgumentException("GPA threshold must be between 0.0 and " + MAX_GPA);
        }
        gpaThreshold = threshold;
    }

    /**
     * Returns the name of this student.
     *
     * @return the student's name
     */
    public String getName() {
        return name;
    }
}