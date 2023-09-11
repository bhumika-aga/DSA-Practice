package PepCoding;

import java.util.Scanner;

public class Permutation {
    public static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int calculatePermutations(int n, int r) {
        int nFact = calculateFactorial(n);
        int nrFact = calculateFactorial((n - r));
        return (nFact / nrFact);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        s.close();
        System.out.println(calculatePermutations(n, r));
    }
}