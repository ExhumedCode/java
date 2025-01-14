public class LibraryBook {
    // Requirement: Include at least two data fields
    private String title;
    private int totalCopies;

    // Requirement: a constructor for the object
    public LibraryBook(String title, int totalCopies) {
        this.title = title;
        this.totalCopies = totalCopies;
    }

    // Requirement: Include at least one method
    public boolean checkOutCopy() {
        if (totalCopies > 0) {
            totalCopies -= 1;
            return true;
        } else {
            return false;
        }
    }

    public int getCopiesRemaining() {
        return totalCopies;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        LibraryBook introToJava = new LibraryBook("Introduction to Java", 5);
        boolean checkoutSuccess = introToJava.checkOutCopy();
        System.out.println("Checkout success: " + checkoutSuccess);
        System.out.println("Copies remaining: " + introToJava.getCopiesRemaining());
    }
}
