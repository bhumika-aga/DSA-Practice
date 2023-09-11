package LeetCode;

import java.util.Arrays;

//https://leetcode.com/problems/sort-colors/
public class SortColors {
    public static void sortColors(int[] nums) {
        int red = 0, white = 0, blue = nums.length - 1;
        while (white <= blue) {
            if (nums[white] == 0) {
                int temp = nums[red];
                nums[red] = nums[white];
                nums[white] = temp;
                white++;
                red++;
            } else if (nums[white] == 1) {
                white += 1;
            } else {
                int temp = nums[white];
                nums[white] = nums[blue];
                nums[blue] = temp;
                blue -= 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}