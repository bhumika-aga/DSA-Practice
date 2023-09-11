package Searching.LeetCode;

//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
public class CountNegativeNumbers {
    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        /*
         * int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1,
         * -1, -2, -3 } };
         * 
         * int[][] grid = { { 3, 2 }, { 1, 0 } };
         */
        int[][] grid = { { 5, 1, 0 }, { -5, -5, -5 } };
        System.out.println(countNegatives(grid));
    }
}