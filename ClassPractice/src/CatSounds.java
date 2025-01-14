public class CatSounds {
    private int size;

    // Getter for size
    public int getSize() {
        return size;
    }

    // Setter for size, with a parameter
    public void setSize(int s) {
        size = s; // Assign the parameter value to the private field
    }

    // Method to determine and print the sound
    void sound() {
        if (size > 60) {
            System.out.println("ROAR!");
        } else if (size > 14) {
            System.out.println("Rawr!");
        } else {
            System.out.println("Meow!");
        }
    }
}