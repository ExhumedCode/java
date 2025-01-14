/*
 * Nelson Villatoro
 * CMSC115
 * Chapter 7 Project 1
 * 12/03/2024
 * 
 * This program reads a list of student scores and assigns letter grades
 * based on the following grading scheme:
 * A: score >= best - 10
 * B: score >= best - 20
 * C: score >= best - 30
 * D: score >= best - 40
 * F: otherwise
 * 
 * The program prompts for the total number of students, collects all scores,
 * and displays each student's score and corresponding grade.
 */
public class Ch7P1 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();

        int[] scores = new int[numStudents];

        System.out.print("Enter " + numStudents + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }

        int best = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > best) {
                best = scores[i];
            }
        }

        for (int i = 0; i < scores.length; i++) {
            char grade;
            if (scores[i] >= best - 10)
                grade = 'A';
            else if (scores[i] >= best - 20)
                grade = 'B';
            else if (scores[i] >= best - 30)
                grade = 'C';
            else if (scores[i] >= best - 40)
                grade = 'D';
            else
                grade = 'F';

            System.out.println("Student " + i + " score is " +
                    scores[i] + " and grade is " + grade);
        }

        input.close();
    }
}
