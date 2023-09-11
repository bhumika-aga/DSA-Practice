package Searching.LeetCode;

//https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                result = i;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 7;
        /*
         * int[] nums = { 1, 3, 5, 6 };
         * int target = 5;
         * int[] nums = { 1, 3, 5, 6 };
         * int target = 2;
         */
        System.out.println(searchInsert(nums, target));
    }
}