public class LibraryObject {
    // Below are two data fields representing attributes of a real-world library
    // book.
    // Line fulfilling requirement: "Include at least two data fields"
    private String title; // Data field 1: The title of the book.
    private int totalCopies; // Data field 2: The total number of copies available.

    // Constructor used to instantiate objects of this class, setting the initial
    // values.
    // Line fulfilling requirement: "a constructor for the object"
    public LibraryBook(String title, int totalCopies) {
        this.title = title;       // Assigning the title passed into the constructor to the field.
        this.totalCopies = totalCopies; // Assigning the total number of copies passed into the constructor to the field.
    }

    // Method to check out a copy of the book, which decrements the available
    // copies.
    // Line fulfilling requirement: "Include at least one method"
    public boolean checkOutCopy() {
        // If at least one copy is available, reduce it by one and return true to
        // indicate success.
        if (totalCopies > 0) {
            totalCopies -= 1; // Decrementing the totalCopies by one.
            return true; // Returning true to indicate that a copy was successfully checked out.
        } else {
            // If no copies are available, return false to indicate checkout cannot occur.
            return false;
        }
    }

    // Additional method (not required but helpful for demonstration) to get the
    // current number of copies.
    public int getCopiesRemaining() {
        return totalCopies; // Returning current number of available copies.
    }

    // Additional method to get the title of the book.
    public String getTitle() {
        return title; // Returning the title of the book.
    }
}

// Example instantiation of the class showing real-world use case.
public class TestLibraryBook {
    public static void main(String[] args) {
        // Instantiating a new LibraryBook object named "introToJava" with initial
        // copies of 5.
        // This line demonstrates the use of the constructor to create an object
        // instance.
        LibraryBook introToJava = new LibraryBook("Introduction to Java", 5);

        // Checking out a copy of "Introduction to Java" to simulate a patron borrowing
        // the book.
        boolean checkoutSuccess = introToJava.checkOutCopy(); // Calls the method defined above.

        // Printing out results to show that the number of copies is reduced.
        System.out.println("Checkout success: " + checkoutSuccess);
        System.out.println("Copies remaining: " + introToJava.getCopiesRemaining());
    }
}
