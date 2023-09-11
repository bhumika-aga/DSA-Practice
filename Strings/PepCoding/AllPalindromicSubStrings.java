package PepCoding;

import java.util.ArrayList;
import java.util.Scanner;

public class AllPalindromicSubStrings {
    public static boolean isPalindrome(String str) {
        int i = 0;

        for (int j = str.length() - 1; i <= j; --j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            ++i;
        }

        return true;
    }

    public static void palindromicSubstrings(String str) {
        ArrayList<String> allPalindromicSubstrings = new ArrayList<String>();

        for (int i = 0; i < str.length(); ++i) {
            for (int j = i + 1; j <= str.length(); ++j) {
                if (isPalindrome(str.substring(i, j))) {
                    allPalindromicSubstrings.add(str.substring(i, j));
                }
            }
        }

        System.out.println(allPalindromicSubstrings);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        s.close();
        palindromicSubstrings(str);
    }
}