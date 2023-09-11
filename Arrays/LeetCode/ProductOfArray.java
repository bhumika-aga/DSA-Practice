package LeetCode;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArray {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        // Solution O(n)
        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = left;
            left = left * nums[i];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right = right * nums[i];
        }

        /*
         * //Solution O(n*n)
         * for (int i = 0; i < nums.length; i++) {
         * int temp = 1;
         * for (int j = 0; j < nums.length; j++) {
         * if (j == i && j < nums.length - 1) {
         * j++;
         * temp = temp * nums[j];
         * } else if (j == i && j == nums.length - 1) {
         * break;
         * } else {
         * temp = temp * nums[j];
         * }
         * }
         * result[i] = temp;
         * }
         */
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 6, 8, 3 };
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}