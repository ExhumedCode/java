public class RectangularPrism {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        System.out.println("Volume: " + calculateVolume(length, width, height));
    }

    public static int calculateVolume(int l, int w, int h) {
        return l * w * h;
    }
}
