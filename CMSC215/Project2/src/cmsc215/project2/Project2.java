package cmsc215.project2;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Scope: Reads student data from a text file and determines honor society
 * eligibility.
 * Functionality: Sets the honor society GPA threshold as the midpoint between
 * the average GPA and maximum GPA (4.0), then identifies eligible students and
 * prints a list of eligible students.
 *
 * Author: Nelson Villatoro
 * Date: Feb 5 2025
 */
public class Project2 {

    /**
     * Main entry point for the program. Processes student data from input file
     * and outputs eligible honor society members.
     */
    public static void main(String[] args) {
        File inputFile = new File("students.txt");
        if (!inputFile.exists()) {
            System.out.println("File Not Found");
            return;
        }

        ArrayList<Student> students = new ArrayList<>();
        double totalGpa = 0.0;
        int count = 0;

        try (Scanner fileScanner = new Scanner(inputFile)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                if (line.isEmpty()) {
                    continue;
                }

                String[] tokens = line.split("\\s+");
                if (tokens.length < 4) {
                    continue;
                }

                String name = tokens[0];
                int creditHours = Integer.parseInt(tokens[1]);
                double qualityPoints = Double.parseDouble(tokens[2]);
                String lastVal = tokens[3];

                Student student;
                if (lastVal.equalsIgnoreCase("freshman")
                        || lastVal.equalsIgnoreCase("sophomore")
                        || lastVal.equalsIgnoreCase("junior")
                        || lastVal.equalsIgnoreCase("senior")) {

                    Undergraduate.Year yr = Undergraduate.Year.valueOf(lastVal.toUpperCase());
                    student = new Undergraduate(name, creditHours, qualityPoints, yr);
                } else {
                    student = new Graduate(name, creditHours, qualityPoints, lastVal);
                }

                students.add(student);

                try {
                    totalGpa += student.gpa();
                    count++;
                } catch (ArithmeticException e) {
                    // Skip students with 0 credit hours in average
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            return;
        }

        double averageGpa = (count == 0) ? 0.0 : (totalGpa / count);
        double threshold = (averageGpa + 4.0) / 2.0;
        Student.setGpaThreshold(threshold);

        System.out.printf("GPA threshold for membership is %.2f%n%n", threshold);

        for (Student s : students) {
            if (s.eligibleForHonorSociety()) {
                System.out.println(s);
            }
        }
    }
}