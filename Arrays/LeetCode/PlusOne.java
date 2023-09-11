package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/plus-one/description/
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int n = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            list.add(0, (digits[i] + n) % 10);
            n = (digits[i] + n) / 10;
        }
        while (n > 0) {
            list.add(0, n % 10);
            n = n / 10;
        }
        if (list.size() == digits.length) {
            for (int i = 0; i < digits.length; i++) {
                digits[i] = list.get(i);
            }
        } else {
            digits = new int[list.size()];
            for (int i = 0; i < digits.length; i++) {
                digits[i] = list.get(i);
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = { 9, 9, 9 };
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}