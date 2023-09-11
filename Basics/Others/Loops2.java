package Others;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-loops/problem
public class Loops2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        for (int i = 1; i <= x; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int n = s.nextInt();
            for (int j = 0; j < n; j++) {
                a = a + (b * (int) Math.pow(2, j));
                System.out.printf(a + " ");
            }
            System.out.println();
        }
        s.close();
    }
}