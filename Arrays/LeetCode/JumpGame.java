package LeetCode;

//https://leetcode.com/problems/jump-game/
public class JumpGame {
    public static boolean canJump(int[] nums) {
        int i = 0;
        for (int j = 0; i < nums.length && i <= j; i++) {
            j = Math.max(i + nums[i], j);
        }
        return i == nums.length;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 0, 4 };
        System.out.println(canJump(nums));
    }
}