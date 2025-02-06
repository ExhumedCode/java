package cmsc215.project2;

/**
 * Scope: Extends Student class to represent undergraduate students with their
 * year classification.
 * Functionality: Adds specific honor society eligibility requirements for
 * undergraduates.
 *
 * Author: Nelson Villatoro
 * Date: Feb 5 2025
 */
public class Undergraduate extends Student {

    /**
     * Enumeration of possible undergraduate classifications.
     */
    public enum Year {
        FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
    }

    /**
     * The year classification of this undergraduate student.
     */
    private Year year;

    /**
     * Constructs an Undergraduate student with the given data.
     *
     * @throws IllegalArgumentException if year is null
     */
    public Undergraduate(String name, int creditHours, double qualityPoints, Year year) {
        super(name, creditHours, qualityPoints);
        if (year == null) {
            throw new IllegalArgumentException("Year classification cannot be null");
        }
        this.year = year;
    }

    /**
     * Determines honor society eligibility based on GPA threshold and year
     * classification.
     * Student must meet GPA requirements and be either Junior or Senior.
     */
    @Override
    public boolean eligibleForHonorSociety() {
        try {
            return super.eligibleForHonorSociety()
                    && (year == Year.JUNIOR || year == Year.SENIOR);
        } catch (ArithmeticException e) {
            return false;
        }
    }

    /**
     * @return string representation in format: "Name (GPA: x.xx, YEAR) where x.xx
     *         is the student's GPA and YEAR is the student's year
     *         classification.
     */
    @Override
    public String toString() {
        try {
            return String.format("Name: %s GPA %.2f %s",
                    getName(),
                    gpa(),
                    year);
        } catch (ArithmeticException e) {
            return String.format("Name: %s GPA N/A %s",
                    getName(),
                    year);
        }
    }
}