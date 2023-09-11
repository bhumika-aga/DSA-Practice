package LeetCode;

import java.util.Arrays;

//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
public class SumZero {
    public static int[] sumZero(int n) {
        int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = i * 2 - n + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }
}