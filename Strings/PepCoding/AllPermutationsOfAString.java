package PepCoding;

import java.util.Scanner;

public class AllPermutationsOfAString {
    public static void permutations(String str) {
        for (int i = 0; i < factorial(str.length()); i++) {
            String result = "";
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for (int j = str.length(); j >= 1; j--) {
                result += sb.charAt(temp % j);
                sb.deleteCharAt(temp % j);
                temp = i / j;
            }
            System.out.println(result);
        }
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        s.close();
        permutations(str);
    }
}