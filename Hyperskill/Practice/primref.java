public class primref {
    public static void main(String[] args) {
        // Primitive type example
        int a = 100; // 'a' stores the value 100 directly in the stack
        int b = a; // 'b' gets a copy of the value stored in 'a'

        System.out.println("Primitive type example:");
        System.out.println("a: " + a); // Prints 100
        System.out.println("b: " + b); // Prints 100

        // Modifying 'b' does not affect 'a'
        b = 200;
        System.out.println("After modifying b:");
        System.out.println("a: " + a); // Still 100, as 'a' and 'b' are independent copies
        System.out.println("b: " + b); // Now 200

        // Reference type example
        String language = new String("java"); // 'language' references a new String object in the heap
        String java = language; // 'java' references the same object in the heap

        System.out.println("\nReference type example:");
        System.out.println("language: " + language); // Prints "java"
        System.out.println("java: " + java); // Prints "java"

        // Modifying the object through one reference affects both
        language = "new value"; // Now 'language' points to a new object in the heap

        System.out.println("After modifying language:");
        System.out.println("language: " + language); // Prints "new value"
        System.out.println("java: " + java); // Still "java" (the original object)
    }
}
