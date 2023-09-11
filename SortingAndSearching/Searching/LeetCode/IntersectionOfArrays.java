package Searching.LeetCode;

import java.util.Arrays;
import java.util.HashSet;

//https://leetcode.com/problems/intersection-of-two-arrays/
//https://leetcode.com/problems/intersection-of-two-arrays-ii/
public class IntersectionOfArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> intersection = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    intersection.add(nums1[i]);
                }
            }
        }
        return null;
    }

    public static int[] intersection2(int[] nums1, int[] nums2) {
        return null;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };

        /*
         * int[] nums1 = {4, 9, 5};
         * int[] nums2 = {9, 4, 9, 8, 4};
         */

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}