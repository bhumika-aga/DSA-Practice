package PepCoding;

import java.util.Scanner;

public class DifferenceBetweenCharacters {
    public static String difference(String str) {
        String result = "" + str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            result += str.charAt(i) - str.charAt(i - 1) + "" + str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        s.close();
        System.out.println(difference(str));
    }
}