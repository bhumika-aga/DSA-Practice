package PepCoding;

import java.util.Scanner;

public class ToggleCase {
    public static String toggleCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) ('A' + c - 'a');
                result += c;
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) ('a' + c - 'A');
                result += c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        s.close();
        System.out.println(toggleCase(str));
    }
}