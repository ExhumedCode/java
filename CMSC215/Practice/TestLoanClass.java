
// Import necessary packages
import java.util.Scanner;

public class TestLoanClass {

    public static void main(String[] args) {
        // Test constructor and getters
        testBasicLoanFunctionality();

        // Test invalid inputs
        testInvalidInputs();

        // Test edge cases
        testEdgeCases();

        // Interactive testing (moved to separate method)
        getUserInputTest();
    }

    private static void testBasicLoanFunctionality() {
        System.out.println("=== Testing Basic Loan Functionality ===");
        Loan loan1 = new Loan(5.0, 10, 10000);

        // Test getters
        assert loan1.getAnnualInterestRate() == 5.0 : "Interest rate getter failed";
        assert loan1.getNumberOfYears() == 10 : "Years getter failed";
        assert loan1.getLoanAmount() == 10000 : "Loan amount getter failed";

        // Test calculations
        double monthlyPayment = loan1.getMonthlyPayment();
        double totalPayment = loan1.getTotalPayment();

        System.out.printf("Monthly Payment: $%.2f\n", monthlyPayment);
        System.out.printf("Total Payment: $%.2f\n", totalPayment);

        // Verify total payment is greater than loan amount
        assert totalPayment > loan1.getLoanAmount() : "Total payment should be greater than loan amount";

        System.out.println("Basic functionality tests passed!\n");
    }

    private static void testInvalidInputs() {
        System.out.println("=== Testing Invalid Inputs ===");

        // Test negative interest rate
        try {
            new Loan(-5.0, 10, 10000);
            System.out.println("Failed: Should throw exception for negative interest rate");
        } catch (IllegalArgumentException e) {
            System.out.println("Passed: Caught negative interest rate");
        }

        // Test negative years
        try {
            new Loan(5.0, -10, 10000);
            System.out.println("Failed: Should throw exception for negative years");
        } catch (IllegalArgumentException e) {
            System.out.println("Passed: Caught negative years");
        }

        // Test negative loan amount
        try {
            new Loan(5.0, 10, -10000);
            System.out.println("Failed: Should throw exception for negative loan amount");
        } catch (IllegalArgumentException e) {
            System.out.println("Passed: Caught negative loan amount");
        }

        System.out.println();
    }

    private static void testEdgeCases() {
        System.out.println("=== Testing Edge Cases ===");

        // Test zero interest loan
        Loan zeroInterestLoan = new Loan(0, 10, 10000);
        System.out.printf("Zero Interest Monthly Payment: $%.2f\n", zeroInterestLoan.getMonthlyPayment());

        // Test one year loan
        Loan oneYearLoan = new Loan(5.0, 1, 10000);
        System.out.printf("One Year Loan Monthly Payment: $%.2f\n", oneYearLoan.getMonthlyPayment());

        // Test very small loan amount
        Loan smallLoan = new Loan(5.0, 10, 100);
        System.out.printf("Small Loan Monthly Payment: $%.2f\n", smallLoan.getMonthlyPayment());

        System.out.println();
    }

    private static void getUserInputTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Interactive Loan Testing ===");

        try {
            System.out.print("Annual Interest Rate (%): ");
            double interestRate = scanner.nextDouble();

            System.out.print("Number of Years: ");
            int years = scanner.nextInt();

            System.out.print("Loan Amount: $");
            int amount = scanner.nextInt();

            Loan userLoan = new Loan(interestRate, years, amount);
            System.out.printf("\nMonthly Payment: $%.2f\n", userLoan.getMonthlyPayment());
            System.out.printf("Total Payment: $%.2f\n", userLoan.getTotalPayment());

        } catch (Exception e) {
            System.out.println("Error: Invalid input");
        } finally {
            scanner.close();
        }
    }
}