import java.util.Scanner;

/*
 * Converts milliseconds to a time format of hours:minutes:seconds.
 * Prompts user for milliseconds input and displays the converted time.
 */
public class Ch6P4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time in milliseconds: ");
        long millis = input.nextLong();
        System.out.println(convertMillis(millis));
        input.close();
    }

    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;
        long seconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long minutes = totalMinutes % 60;
        long hours = totalMinutes / 60;

        return hours + ":" + minutes + ":" + seconds;
    }
}
