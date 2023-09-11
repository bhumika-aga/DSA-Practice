package LeetCode;

import java.util.*;

//https://leetcode.com/problems/add-to-array-form-of-integer/
public class ArrayFormToInt {
    public static List<Integer> addToArray(int[] num, int k) {
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = num.length - 1; i >= 0; i--) {
            number.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while (k > 0) {
            number.add(0, k % 10);
            k = k / 10;
        }
        return number;
    }

    public static void main(String[] args) {
        int[] num = { 1, 2, 0, 0 };
        int k = 34;
        System.out.println(addToArray(num, k));
    }
}