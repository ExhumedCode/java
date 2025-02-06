package cmsc215.project2;

/**
 * Scope: Represents a graduate student with specific honor society eligibility
 * requirements.
 * Functionality: Only master's degree students are eligible for honor society
 * membership.
 *
 * Author: Nelson Villatoro
 * Date: Feb 5 2025
 */
public class Graduate extends Student {

    /**
     * The type of degree this graduate student is pursuing (Masters or Doctorate).
     */
    private String degreeType;

    /**
     * Constructs a Graduate student with the given data.
     *
     * @param name          student's name
     * @param creditHours   total credit hours
     * @param qualityPoints total quality points
     * @param degreeType    type of degree ("Masters" or "Doctorate")
     * @throws IllegalArgumentException if inputs are invalid
     */
    public Graduate(String name, int creditHours, double qualityPoints, String degreeType) {
        super(name, creditHours, qualityPoints);
        this.degreeType = degreeType;
    }

    /**
     * Determines honor society eligibility based on GPA threshold and degree type.
     * Only master's students who meet the GPA requirements are eligible.
     */
    @Override
    public boolean eligibleForHonorSociety() {
        return super.eligibleForHonorSociety()
                && degreeType != null
                && degreeType.equalsIgnoreCase("masters");
    }

    /**
     * Returns a string representation of the graduate student, including their
     * name, GPA, and degree type.
     *
     * @return a string in the format: "Name: name GPA: x.xx Degree: type" where
     *         x.xx
     *         is the student's GPA and type is the student's degree type.
     */
    @Override
    public String toString() {
        double gpaVal;
        try {
            gpaVal = gpa();
        } catch (ArithmeticException e) {
            gpaVal = 0.0;
        }
        return String.format("Name: %s GPA %.2f %s",
                getName(),
                gpaVal,
                degreeType.toUpperCase());
    }
}