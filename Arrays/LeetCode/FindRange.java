package LeetCode;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FindRange {
    public static int[] searchRange(int[] nums, int target) {
        int[] range = new int[2];
        int begin = -1, end = -1, i = 0;
        if (nums.length != 0 || nums != null) {
            while (i < nums.length) {
                if (nums[i] == target) {
                    begin = i;
                    break;
                }
                i++;
            }
            i = nums.length - 1;
            while (i >= 0) {
                if (nums[i] == target) {
                    end = i;
                    break;
                }
                i--;
            }
            range[0] = begin;
            range[1] = end;
        }
        return range;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 6;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}