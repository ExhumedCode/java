package Sequence;
import java.util.Scanner;
public class Sequence {
    public static void main(String[] args) {
        System.out.println("hi");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(sum += i);
        }
        System.out.println(sum);
    }
}
