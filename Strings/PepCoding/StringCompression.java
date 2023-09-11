package PepCoding;

import java.util.Scanner;

public class StringCompression {
    public static String stringCompression1(String str) {
        String result = "" + str.charAt(0);

        for (int i = 1; i < str.length(); ++i) {
            char current = str.charAt(i);
            char previous = str.charAt(i - 1);
            if (current != previous) {
                result = result + current;
            }
        }

        return result;
    }

    public static String stringCompression2(String str) {
        String result = "" + str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); ++i) {
            char current = str.charAt(i);
            char previous = str.charAt(i - 1);
            if (current != previous) {
                if (count > 1) {
                    result = result + count;
                    count = 1;
                }

                result = result + current;
            } else {
                ++count;
            }
        }

        return count != 1 ? result + count : result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        s.close();
        System.out.println(stringCompression1(str));
        System.out.println(stringCompression2(str));
    }
}