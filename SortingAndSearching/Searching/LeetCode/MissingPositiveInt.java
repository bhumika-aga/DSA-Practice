package Searching.LeetCode;

//https://leetcode.com/problems/kth-missing-positive-number/
public class MissingPositiveInt {
    public static int kthMissingPositiveInt(int[] arr, int k) {
        for (int i : arr) {
            if (i <= k) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;
        /*
         * int[] arr = { 1, 2, 3, 4 };
         * int k = 2;
         */
        System.out.println(kthMissingPositiveInt(arr, k));
    }
}